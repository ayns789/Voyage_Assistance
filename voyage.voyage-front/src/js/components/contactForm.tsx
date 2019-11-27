import React from "react";
import { MDBRow, MDBCol, MDBCard, MDBCardBody, MDBIcon, MDBBtn, MDBInput, MDBNavLink } from "mdbreact";
// import {call} from "react-native-phone-call";


//   const makeCall = {
//       number: '0134568971', // String value with the number to call
//       prompt: false // Optional boolean property. Determines if the user should be prompt prior to the call 
//   }
//  call(makeCall).catch(console.error)


const contactSub = () => {
  return (
    <section className="my-5 pr-4 pl-4">
      <h2 className="h2-responsive font-weight-bold text-center my-5 deep-purple-text text-monospace text-uppercase z-depth-5">
        Contactez nous
      </h2>
      <p className="text-center w-responsive mx-auto pb-5 dark-text font-weight-normal text-monospace lead">
        Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fugit,
        error amet numquam iure provident voluptate esse quasi, veritatis
        totam voluptas nostrum quisquam eum porro a pariatur veniam.
      </p>
      
      <MDBRow>
      {/* <MDBCol md="2"></MDBCol> */}
        <MDBCol md="6">
          <MDBCard>
            <MDBCardBody className="dark-text">
              <div className="form-header blue accent-1 z-depth-1 rounded mb-0">
                <h3 className="mt-2 ml-2 pt-2 pb-2">
                  <MDBIcon icon="envelope" /><strong> Pour nous écrire :</strong>
                </h3>
              </div>
              
              <div className="md-form dark-text font-weight-light text-monospace lead text-uppercase">
                <MDBInput 
                  icon="user"
                  label="Votre nom"
                  iconClass="dark-text"
                  type="text"
                  id="form-name"
                />
              </div>
              <div className="md-form dark-text font-weight-light text-monospace lead text-uppercase">
                <MDBInput
                  icon="envelope"
                  label="Votre email"
                  iconClass="dark-text"
                  type="text"
                  id="form-email"
                />
              </div>
              <div className="md-form dark-text font-weight-light text-monospace lead text-uppercase">
                <MDBInput
                  icon="tag"
                  label="Sujet"
                  iconClass="dark-text"
                  type="text"
                  id="form-subject"
                />
              </div>
              <div className="md-form dark-text font-weight-light text-monospace lead text-uppercase">
                <MDBInput
                  icon="pencil-alt"
                  label="Votre message"
                  iconClass="dark-text"
                  type="textarea"
                  id="form-text"
                />
              </div>
              <div className="text-center">
                <MDBBtn color="light-blue font-weight-bold ">Envoyer</MDBBtn>
              </div>
            </MDBCardBody>
          </MDBCard>
        </MDBCol>
        
        <MDBCol md="6" className="d-flex justify-content-center align-items-center">
        <MDBRow className="text-center">
            <MDBCol>
            <a href="https://www.google.fr/maps/place/35+Rue+Kl%C3%A9ber,+92130+Issy-les-Moulineaux/@48.8247701,2.2720859,17z/data=!3m1!4b1!4m5!3m4!1s0x47e67a827e523c7d:0xca85b8e2599bdd50!8m2!3d48.8247666!4d2.2742746">
              <MDBBtn tag="a" floating color="blue" className="accent-1 rounded-circle">
                <MDBIcon icon="home" />
              </MDBBtn>
              </a>
              <p>33 rue Montparnasse</p>
              <p>75020 Paris</p>
              <p className="mb-md-0">France</p>
            </MDBCol>
            <MDBCol>
            {/* onPress={()=> this.makeCall()} */}
              <MDBBtn tag="a" floating color="blue" className="accent-1 rounded-circle">
                <MDBIcon icon="phone" />
              </MDBBtn>
              <p>++33 1 34 56 89 71</p>
              <p className="red-text text-uppercase font-weight-bold">Horaires</p>
              <p className="mb-md-0">Lundi - Vendredi, 9:00-19:00</p>
            </MDBCol>
            <MDBCol>
              <MDBBtn tag="a" floating color="blue" className="accent-1 rounded-circle">
                <MDBIcon icon="envelope" />
              </MDBBtn>
              <p className="mb-md-0">support@voyage-assistance.com</p>
            </MDBCol>
          </MDBRow> 

        </MDBCol>
      </MDBRow>
    </section>
  );
}

export default contactSub;