import React from "react";
import { MDBContainer, MDBRow, MDBCol, MDBBtn, MDBIcon } from "mdbreact";

const subscribeNews = () => {
  return (

    <div>
    <MDBContainer>
      <MDBRow>
        <MDBCol md="12">
          <form>
            <h2 className="h2-responsive font-weight-bold text-center my-3 deep-purple-text text-monospace text-uppercase z-depth-1 cloudy-knoxville-gradient rounded mb-0">Reçevez notre newsletter, avec les dernières offres de séjours</h2>
            <label
              htmlFor="defaultFormCardNameEx"
              className="dark-text font-weight-light text-monospace lead"
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
              className="dark-text font-weight-light text-monospace lead"
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
    </div>
  );
};

export default subscribeNews;