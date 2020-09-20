import React, { Component } from 'react';
import ModalDelPage from "../components/modalDelProfil";
import { MDBContainer, MDBBtn, MDBModal, MDBModalBody, MDBModalHeader, MDBModalFooter, MDBInput } from 'mdbreact';

interface Props {
  title: string;
}

// //Typescript
interface State {
  // accountId: number;
  firstName: string;
  lastName: string;
  modal14: boolean;
}

class ModalModifPage extends Component {
  handleChangeIdUser: any;
  constructor(props) {
    super(props);
    this.state = {
      // accountId: 0,
      firstName:"", 
      lastName:"",
      modal14: false
    }
    // this.handleChangeAccountId = this.handleChangeAccountId.bind(this);
    this.handleChangeFirstName = this.handleChangeFirstName.bind(this);
    this.handleChangeLastName = this.handleChangeLastName.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  

  // const idUser = localStorage.getItem("user_id");
  // handleChangeAccountId(accountId) {
  //   this.setState({ accountId : accountId });
  // }

  handleChangeFirstName(firstName) {
    this.setState({ firstName : firstName });
  }

  handleChangeLastName(lastName) {
    this.setState({ lastName : lastName });
  }

  handleSubmit = event =>{
    
    event.preventDefault();

    const id = localStorage.getItem("user_id");
    alert( "id user: " + id);

    // handleChangeAccountId(accountId) {
    //   this.setState({ accountId : userId });
    // }

    // this.setState.accountId = localStorage.getItem("user_id");

    // this.setState.accountId = userId;
    
    // const userId = localStorage.getItem("user_id");
    // this.state.accountId  = id;

    const {  firstName, lastName } = this.state;
    alert(this.state.firstName + this.state.lastName );

    //Si un champ est vide on arrete l'execution de la fonction
    if ( !firstName || !lastName ) {
      alert("[Erreur] Les champs doivent être remplis");
      return;
    }
    
    const url = "http://localhost:8282/api/account/modif/" + id;
    
    const headers = new Headers({
                        "Accept": "application/json",
                      "Content-Type": "application/json"});
                
                      fetch( url, {
                        method: "PUT",
                        headers,
                        body: JSON.stringify( { 
                          // accountId: accountId,
                          firstName : firstName,
                          lastName : lastName
                        } ),
                        mode: "cors"
                    })
                    .then(data => {
                      if (data.status == 200) {
                        console.log("[Succès] Modifications enregistrées");
                      } else {
                        console.log("[Erreur] Veuillez recommencer");
                      }
                    });

      // .then(res => {return res.json();})
      // .then(json => {
      //   this.setState({
      //     isLoaded: true,
      //     userId: json.userId,
      //     firstName: json.firstName, 
      //     lastName: json.lastName
      //     // refresh_token: json.refresh_token
      //       })
      //       // alert(this.state.refresh_token);
      //       // localStorage.setItem("refresh_token", this.state.refresh_token);
      // });
      // alert(this.state.username);
  }
// state = {
//   modal14: false
// }

toggle = nr => () => {
  let modalNumber = 'modal' + nr
  this.setState({
    [modalNumber]: !this.state[modalNumber]
  });
}

render() {
  // const username = this.state.username;
  //   const firstName = this.state.firstName;
  //   const lastName = this.state.lastName;

  return (
    <React.Fragment>
      <MDBContainer>
        <MDBBtn color="primary" onClick={this.toggle(14)}>Modifier mes informations / supprimer mon compte</MDBBtn>
        <MDBModal isOpen={this.state.modal14} toggle={this.toggle(14)} centered>
          <MDBModalHeader toggle={this.toggle(14)}>Modification</MDBModalHeader>
          <MDBModalBody>
          <form  onSubmit={this.handleSubmit}>
          <MDBInput
                    label="Votre prénom"
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
                    label="Votre nom"
                    group
                    type="text"
                    name="lastName"
                    className="form-control"
                    validate
                    error="wrong"
                    success="right"
                    onChange={e => this.handleChangeLastName(e.target.value)}
                  />
                  
          {/* <label
                htmlFor="defaultFormEmailEx"
                className="grey-text font-weight-light"
              >
                Votre prénom
              </label>
              <input
                type="email"
                id="defaultFormEmailEx"
                className="form-control"
              />

              <label
                htmlFor="defaultFormPasswordEx"
                className="grey-text font-weight-light"
              >
                Votre nom
              </label>
              <input
                type="password"
                id="defaultFormPasswordEx"
                className="form-control"
              /> */}
          {/* </MDBModalBody> */}
          <MDBModalFooter>
            <MDBBtn color="secondary" onClick={this.toggle(14)}>Annuler</MDBBtn>
            <MDBBtn color="primary" type="submit">Enregistrer</MDBBtn>
            
            <p className="text-center">
                <ModalDelPage />
                </p>
                
                
            
            {/* <MDBBtn outline color="danger">Supprimer le compte</MDBBtn> */}
            
                
          </MDBModalFooter>
          </form>
          
          </MDBModalBody>
          
        </MDBModal>
        
      </MDBContainer>
      
      </React.Fragment>
    );
  }
}

export default ModalModifPage;