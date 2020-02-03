import React from "react";
import { MDBContainer, MDBRow, MDBCol, MDBInput, MDBBtn, MDBCard, MDBCardBody, MDBIcon, MDBCardHeader, MDBFormInline } from "mdbreact";
import { Redirect, Link } from "react-router-dom";

interface Props {
  title: string;
}

// //Typescript
interface State {
  civility: number;
  firstName: string;
  lastName: string;
  username: string;
  password: string;
  confirmation: string;
  role: number;
  submitted: boolean;
      loading: boolean;
  // user: object;
  // userIsDefined: boolean;
}

class Register extends React.Component <Props, State> {

  // state: {
  // civility: number;
  // firstName: string;
  // lastName: string;
  // username: string;
  // password: string;
  // confirmation: string;
  // }
  

  constructor(props) {
    super(props);

    this.state = {
      civility: 0,
      firstName:"", 
      lastName:"",
      username:"",
      password:"",
      confirmation: "",
      role: 0,
      submitted: false,
      loading: false
      // user: {},
      // userIsDefined: false
    };
    this.handleChangeCivility = this.handleChangeCivility.bind(this);
    this.handleChangeFirstName = this.handleChangeFirstName.bind(this);
    this.handleChangeLastName = this.handleChangeLastName.bind(this);
    this.handleChangeUsername = this.handleChangeUsername.bind(this);
    this.handleChangePassword = this.handleChangePassword.bind(this);
    this.handleChangeConfirmation = this.handleChangeConfirmation.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }


  handleChangeCivility(civility) {
    this.setState({ civility : civility });
  }

  handleChangeFirstName(firstName) {
    this.setState({ firstName : firstName });
  }

  handleChangeLastName(lastName) {
    this.setState({ lastName : lastName });
  }

  handleChangeUsername(username) {
    this.setState({ username: username });
  }

  handleChangePassword(password) {
    this.setState({ password: password });
  }

  handleChangeConfirmation(confirmation) {
    this.setState({ confirmation: confirmation });
  }


  handleSubmit = event =>{
    event.preventDefault();

//     let element = event.currentTarget as HTMLInputElement;
// let value = element.value;

//On actualise notre state
this.setState({
  submitted: true
});
    

    const { civility, firstName, lastName, username, password, confirmation } = this.state;
    
    //Si un champ est vide on arrete l'execution de la fonction
    if (!civility || !firstName || !lastName || !username || !password || !confirmation) {
      alert("[Erreur] Les champs doivent être remplis");
      return;
    }
    
    if (password != confirmation) {
      alert("[Erreur] Le mot de passe ne correspond pas");
      return;
    }

    //On actualise notre state
    this.setState({
      loading: true
    });

  alert('Le username a été soumis : ' + this.state.username + ' civility : ' + this.state.civility );

  const url ="http://localhost:8282/api/account/add";

  const headers = new Headers({
    "Accept": "application/json",
  "Content-Type": "application/json"});

  
  fetch(url, { 

      method: "POST", 
      headers,
      body: JSON.stringify( { 
        firstName : firstName,
        lastName : lastName,
        username: username,
        password: password,
        civility: civility,
        role: 1
      } ),
      mode: "cors"
  })
  .then(data => {
    if (data.status == 200) {
      console.log("[Succès] Compte enregistré");
      location.href = "/login";
    } else {
      console.log("[Erreur] Veuillez recommencer");
    }
  });
}

    render() {

      if (localStorage.getItem("access_token")) {
        location.href = "/login";
        return (
          <Redirect
            to={{
              pathname: "/login"
            }}
          />
        );
      }

  return (
    <React.Fragment>
    <section className="my-5">
    <MDBContainer>
      <MDBRow>
        <MDBCol md="12">
          <MDBCard>
            <MDBCardBody>
            <MDBCardHeader className="form-header deep-blue-gradient rounded">
                <h3 className="my-3">
                  <MDBIcon icon="lock" /> Créer un compte :
                </h3>
              </MDBCardHeader>
              <form className="my-5" onSubmit={this.handleSubmit}>

              <div>
              <select className="browser-default custom-select" onChange={e => this.handleChangeCivility(e.target.value)}>
          <option>Sélectionnez votre civilité :</option>
          <option value="1">monsieur</option>
          <option value="2">madame</option>
        </select>
      </div>
                
                <div className="grey-text">
                  <MDBInput
                    label="Votre prénom"
                    icon="user"
                    group
                    type="text"
                    name="lastName"
                    className="form-control"
                    validate
                    error="wrong"
                    success="right"
                    onChange={e => this.handleChangeLastName(e.target.value)}
                  />
                  <MDBInput
                    label="Votre nom"
                    icon="user"
                    group
                    type="text"
                    name="firstName"
                    className="form-control"
                    validate
                    error="wrong"
                    success="right"
                    onChange={e => this.handleChangeFirstName(e.target.value)}
                  />
                  <MDBInput
                    label="Votre nom d'utilisateur"
                    icon="user"
                    group
                    type="text"
                    name="username"
                    className="form-control ember-text-field ember-view"
                    // autoComplete=​"username" 
                    validate
                    error="wrong"
                    success="right"
                    onChange={e => this.handleChangeUsername(e.target.value)}
                  />
                  <MDBInput
                    label="Votre mot de passe"
                    icon="lock"
                    group
                    type="password"
                    name="password"
                    validate
                    // required
                    autoComplete="current-password"
                    className="form-control"
                    minlength="6"
                    maxlength="15"
                    onChange={e => this.handleChangePassword(e.target.value)}
                  />
                  <MDBInput
                    label="Confirmez votre mot de passe"
                    icon="exclamation-triangle"
                    group
                    type="password"
                    name="password"
                    validate
                    autoComplete="new-password"
                    required
                    className="form-control"
                    minlength="6"
                    maxlength="15"
                    onChange={e => this.handleChangeConfirmation(e.target.value)}
                  />
                </div>
                <div className="text-center py-4 mt-3">
                  <MDBBtn color="light-blue" type="submit" className="font-weight-bold">
                    Register
                  </MDBBtn>
                </div>
              </form>
              
              <Link to="/login" className="white-text z-depth-3">
                <MDBBtn gradient="blue" className="rounded-pill font-weight-bold ">
                  <MDBIcon  icon='mouse-pointer' className='left' />  Vous avez déjà un compte ? Cliquez ici
                </MDBBtn>
                </Link>
            </MDBCardBody>
          </MDBCard>
        </MDBCol>
      </MDBRow>
    </MDBContainer>
    </section>
    </React.Fragment>
  );
}
}

export default Register;