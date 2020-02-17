import * as React from "react";
import { Redirect, Link } from "react-router-dom";
// import { Container, Col, Form,
//   FormGroup, Label, Input,
//   Button } from 'reactstrap';
import "../../less/components/login.less";
import {
  MDBContainer,
  MDBRow,
  MDBCol,
  MDBCard,
  MDBCardBody,
  MDBModalFooter,
  MDBIcon,
  MDBCardHeader,
  MDBBtn,
  MDBInput
} from "mdbreact";
// import ls from 'local-storage';


//Typescript
interface Props {
  title: string;
}

//Typescript
interface State {
  username: string;
  password: string;
  grant_type: string;
  client_id: string;
  user_id: number;
  access_token: string;
  // refresh_token: string;
  user: object;
  userIsDefined: boolean;
  // submitted: boolean,
  //     loading: boolean,
  //     error: string
}

export default class Login extends React.Component<Props, State> {
  constructor(props) {
    super(props);

  this.state = {
    username: "",
    password: "",
    grant_type: "password",
    client_id: "my-client-app",
    user_id: 0,
    access_token: "",
    // refresh_token: "",
    user: {},
    userIsDefined: false
    // submitted: false,
    //   loading: false,
    //   error: ""
  };

  this.handleChangeUsername = this.handleChangeUsername.bind(this);
    this.handleChangePassword = this.handleChangePassword.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  // componentDidMount() {
  //   // window.localStorage.clear();
  // }

  handleChangeUsername(username) {
    this.setState({ username: username });
  }

  handleChangePassword(password) {
    this.setState({ password: password });
  }

  // setProfile(profile){
  //   // Saves profile data to localStorage
  //   localStorage.setItem('profile', JSON.stringify(this.state));
  // }


  handleSubmit(event) {
    event.preventDefault();

    // //On actualise notre state
    // this.setState({
    //   submitted: true
    // });

    // sessionStorage.user = {name: this.state.username.valueOf};

    const { username, password, grant_type, client_id } = this.state;

    if (!username || !password || !grant_type || !client_id) {
      alert("Les champs doivent être remplis");
      return;
    }

    // //On actualise notre state
    // this.setState({
    //   loading: true
    // });

    // console.log(this.state);
    // alert('Le username a été soumis : ' + this.state.username + ' civility : ' + this.state.password );

    // let daty;

    fetch("http://localhost:8282/oauth/token", {
      method: "POST",
      headers: {
        "Content-Type": "application/x-www-form-urlencoded;charset=UTF-8"
      },
      body:
        "username=" +
        username +
        "&password=" +
        password +
        "&grant_type=" +
        grant_type +
        "&client_id=" +
        client_id +
        "" , 
      mode: "cors"
    }).then(data => {
      data.json().then(results => {
        if (results.access_token) {
          
          this.setState({
            access_token: results.access_token,
            user_id: results.userId
            // client_id: results.client_id
            // id : ls.get(id);
          });

          localStorage.setItem("access_token", JSON.stringify(this.state.access_token));
          localStorage.setItem("user_id", this.state.user_id);
          // const userdata = this.state;
          // localStorage.setItem({userdata});
          // localStorage.setItem("daty", data.USER_ID_KEY);
          // localStorage.setItem("daty", JSON.stringify(data));
          // sessionStorage.setItem("daty", JSON.stringify(this.state));
          
          this.setState({ userIsDefined: true });
          console.log("access_token", localStorage.getItem("access_token"));
        }
      });
    });

  }

  // private readonly newProperty = this;

  // private newMethod() {
  //   localStorage.setItem("data", this.newProperty.state);
  // }

  render() {
    if (localStorage.getItem("access_token")) {
      location.href = "/profil";
      // let daty;
      // localStorage.setItem(daty, JSON.stringify(this.state));
      return (
        <Redirect
          to={{
            pathname: "/profil"
          }}
        />
      );
    }

    return (

      <React.Fragment>
      <section className="my-5">
    <MDBContainer className="Login">
      <MDBRow>
        <MDBCol md="12">
          <MDBCard>
            <MDBCardBody>
              <MDBCardHeader className="form-header deep-blue-gradient rounded">
                <h3 className="my-3">
                  <MDBIcon icon="lock" /> Connectez vous :
                </h3>
              </MDBCardHeader>
              <form onSubmit={this.handleSubmit}>
                <div className="grey-text">
                  <MDBInput
                    label="Entrez votre nom d'utilisateur"
                    icon="user"
                    group
                    type="text"
                    name="username"
                    validate
                    error="wrong"
                    success="right"
                    onChange={e => this.handleChangeUsername(e.target.value)}
                  />
                  <MDBInput
                    label="Entrez votre mot de passe"
                    icon="lock"
                    group
                    type="password"
                    name="password"
                    validate
                    onChange={e => this.handleChangePassword(e.target.value)}
                  />
                </div>

              <div className="text-center mt-4">
                <MDBBtn
                  color="light-blue"
                  className="mb-3"
                  type="submit"
                >
                  Valider
                </MDBBtn>
              </div>
              </form>
              <MDBModalFooter>
                <div className="font-weight-light">
                <Link to="/creer-compte" className="white-text z-depth-3">
                <MDBBtn gradient="blue" className="rounded-pill font-weight-bold">
                  <MDBIcon  icon='mouse-pointer' className='left' />  Pas encore membre ? Enregistrez vous
                </MDBBtn>
                </Link>
                  {/* <p>Pas encore membre ? Enregistrez vous</p> */}
                  {/* <p>Mot de passe oublié ?</p> */}
                </div>
              </MDBModalFooter>
            </MDBCardBody>
          </MDBCard>
        </MDBCol>
      </MDBRow>
    </MDBContainer>
    </section>
    </React.Fragment>
  );
};
      
export default Login;



// // ./pages/login.js
// import React, {Component} from 'react';
// import AuthService from '../components/authService';

// const auth = new AuthService("http://localhost:8282/oauth/token");

// class Login extends Component {
//   constructor(props) {
//     super(props);
//     this.handleSubmit = this.handleSubmit.bind(this);
//   }

//   componentDidMount () {
//     if (auth.loggedIn()) {
//       this.props.url.replaceTo('/profil');   // redirect if you're already logged in
//     }
//   }

//   handleSubmit (e) {
//     e.preventDefault()
//     // yay uncontrolled forms!
//     auth.login(this.refs.username.value, this.refs.password.value)
//       .then(res => {
//         console.log(res)
//         this.props.url.replaceTo('/profil');
//       })
//       .catch(e => console.log(e))  // you would show/hide error messages with component state here 
//   }

//   render () {
//     return (
//       <div>
//          Login
//           <form onSubmit={this.handleSubmit} >
//             <input type="text" ref="username"/>
//             <input type="password" ref="password"/>
//             <input type="submit" value="Submit"/>
//           </form>
//       </div>
//     )
//   }
// }

// export default Login;