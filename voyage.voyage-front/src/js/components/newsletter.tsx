import React from "react";
import { MDBContainer, MDBRow, MDBCol, MDBBtn, MDBIcon,  } from 'mdbreact';

const subscribeNews = () => {
  return (

    
    <MDBContainer>
      <MDBRow>
        <MDBCol md="12">
          <form>
            <h2 className="h2 text-center py-4">Recevez les dernières offres de séjours</h2>
            <label
              htmlFor="defaultFormCardNameEx"
              className="grey-text font-weight-light"
            >
              Votre prénom
            </label>
            <input
              type="text"
              id="defaultFormCardNameEx"
              className="form-control"
            />
            <br />
            <label
              htmlFor="defaultFormCardEmailEx"
              className="grey-text font-weight-light"
            >
              Votre email
            </label>
            <input
              type="email"
              id="defaultFormCardEmailEx"
              className="form-control"
            />
            <div className="text-center py-4 mt-3">
              <MDBBtn className="btn btn-outline-purple" type="submit">
                Envoyer
                <MDBIcon far icon="paper-plane" className="ml-2" />
              </MDBBtn>
            </div>
          </form>
        </MDBCol>
      </MDBRow>
    </MDBContainer>
  );
};

export default subscribeNews;