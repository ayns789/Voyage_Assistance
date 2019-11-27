import React from "react";
import { MDBCol, MDBContainer, MDBRow, MDBFooter, MDBBtn, MDBIcon } from "mdbreact";

const FooterPage = () => {
  return (
    <MDBFooter color="blue-gradient" className="font-small pt-4 mt-4">
      <MDBContainer fluid className="text-center text-md-left">
        <MDBRow>
          <MDBCol md="4" className="mt-2">
            <h5 className="title h2-responsive font-weight-bold text-center  text-monospace text-uppercase">A propos de la compagnie</h5>
            <br />
            <p className="text-justify text-center w-responsive mx-auto pb-5 dark-text font-weight-normal text-monospace lead">
              Here you can use rows and columns here to organize your footer
              content, to organize your footer
              content. 
              
              Here you can use rows and columns here to organize your footer
              content, to organize your footer
              content.

              Here you can use rows and columns here to organize your footer
              content, to organize your footer
              content.
            </p>

          </MDBCol>
          
          <MDBCol md="4" className="flex-center flex-column mt-3 font-weight-bold text-center  text-monospace">
            <MDBBtn tag="a" floating color="dark" className="accent-1 rounded-circle">
                <MDBIcon icon="home" />
              </MDBBtn>
              <p>33 rue Montparnasse</p>
              <p>75020 Paris</p>
              <p className="mb-md-0">France</p>
              
              <MDBBtn tag="a" floating color="dark" className="accent-1 rounded-circle">
                <MDBIcon icon="phone" />
              </MDBBtn>
              <p>++33 1 34 56 89 71</p>
              <p className="mb-md-0">Lundi - Vendredi, 9:00-19:00</p>
              
              <MDBBtn tag="a" floating color="dark" className="accent-1 rounded-circle">
                <MDBIcon icon="envelope" />
              </MDBBtn>
              <p className="mb-3">support@voyage-assistance.com</p>
              
            </MDBCol>
            
            <MDBCol md="4" className="flex-center flex-column mb-3">
            <img
              src="https://mdbootstrap.com/img/Photos/Others/images/82.jpg"
              // src="https://i.ibb.co/5WzzW03/logo2.png"
              alt=""
              className="img-fluid rounded z-depth-2 ml-2" height="500" width="500"
            />
            
            </MDBCol>
          </MDBRow>
        
      </MDBContainer>
      <div className="footer-copyright text-center py-3">
        <MDBContainer fluid>
          &copy; {new Date().getFullYear()} Copyright: <a href="https://www.voyage-assistance.com"> voyage-assistance.com </a>
        </MDBContainer>
      </div>
    </MDBFooter>
  );
}

export default FooterPage;