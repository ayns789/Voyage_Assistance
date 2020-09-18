import React, { Component } from 'react';
import { MDBContainer, MDBBtn, MDBModal, MDBModalBody } from 'mdbreact';

class ModalDelPage extends React.Component {

    constructor(props) {
        super(props);
        this.handleClick = this.handleClick.bind(this);
      }

      state = {
        modal11: false
        }


      handleClick() {
        const id = localStorage.getItem("user_id");
        alert( "id user: " + id);

        const url = "http://localhost:8282/api/account/del/" + id;
    
    const headers = new Headers({
                        "Accept": "application/json",
                      "Content-Type": "application/json"});
                
                      fetch( url, {
                        method: "DELETE",
                        headers,
                        mode: "cors"
                    })
                    .then(data => {
                      if (data.status == 200) {
                        console.log("[Succès] votre compte a été supprimé");
                        location.href = "/home";
                      } else {
                        console.log("[Erreur] veuillez recommencer");
                      }
                    });
      }
    

toggle = nr => () => {
  let modalNumber = 'modal' + nr
  this.setState({
    [modalNumber]: !this.state[modalNumber]
  });
}


render() {
  return (
      <MDBContainer>
        <MDBBtn outline color="danger" onClick={this.toggle(11)}>Supprimer mon compte</MDBBtn>
        <MDBModal isOpen={this.state.modal11} toggle={this.toggle(11)} frame position="top">
          <MDBModalBody className="text-center">
            Etes vous sûr de vouloir supprimer votre compte ?
            <MDBBtn color="secondary" onClick={this.toggle(11)}>Annuler</MDBBtn>
            <MDBBtn color="primary" onClick={this.handleClick}>Confirmer</MDBBtn>
          </MDBModalBody>
        </MDBModal>
      </MDBContainer>
    );
  }
}

export default ModalDelPage;