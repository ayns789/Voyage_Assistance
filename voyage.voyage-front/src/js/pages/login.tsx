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
  access_token: string;
  user: object;
  userIsDefined: boolean;
}

export default class Login extends React.Component<Props, State> {
  constructor(props) {
    super(props);

  this.state = {
    username: "",
    password: "",
    grant_type: "password",
    client_id: "my-client-app",
    access_token: "",
    user: {},
    userIsDefined: false
  };

  this.handleChangeUsername = this.handleChangeUsername.bind(this);
    this.handleChangePassword = this.handleChangePassword.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  componentDidMount() {
    // window.localStorage.clear();
  }

  handleChangeUsername(username) {
    this.setState({ username: username });
  }

  handleChangePassword(password) {
    this.setState({ password: password });
  }


  handleSubmit(event) {
    event.preventDefault();

    const { username, password, grant_type, client_id } = this.state;

    if (!username || !password || !grant_type || !client_id) {
      alert("Les champs doivent être remplis");
      return;
    }
    // console.log(this.state);
    // alert('Le username a été soumis : ' + this.state.username + ' civility : ' + this.state.password );

    fetch("http://localhost:8282/oauth/token", {
      method: "POST",
      headers: {
        "Content-Type": "application/x-www-form-urlencoded"
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
        "",
      mode: "cors"
    }).then(data => {
      data.json().then(results => {
        if (results.access_token) {
          this.setState({
            access_token: results.access_token
          });

          localStorage.setItem("access_token", this.state.access_token);
          this.setState({ userIsDefined: true });
          console.log("access_token", localStorage.getItem("access_token"));
        }
      });
    });

  }

  render() {
    if (localStorage.getItem("access_token")) {
      location.href = "/profil";
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
      
// export default Login;
