import * as React from "react";
import { func } from "prop-types";
import {  MDBRow, MDBCol, MDBIcon, MDBBtn, MDBCard, MDBCardBody, MDBMask, MDBView, MDBBadge,  MDBAnimation } from "mdbreact";
import "../../less/components/pages.less";


class homePrez extends React.Component {
  constructor(props) {
    super(props);
  }
  render() {
    return(
    <section className="my-5 mr-5 ml-5">
        <h2 className="h2-responsive font-weight-bold text-center my-5 deep-purple-text text-monospace text-uppercase z-depth-1 cloudy-knoxville-gradient rounded mb-0"> 
        {/* heavy-rain-gradient */}
          Notre société
        </h2>

        
            <MDBRow className="mb-3">
            <MDBCol lg="7">
            <MDBRow className="mb-3">
            <MDBCol>
            <MDBAnimation type="bounce-slow" infinite>
            <img className="img-fluid img-thumbnail" alt="" src="https://i.ibb.co/5WzzW03/logo2.png" />
        </MDBAnimation>
    {/* <img src="https://i.ibb.co/5WzzW03/logo2.png" alt="logo" className="img-thumbnail" /> */}
  </MDBCol>
              {/* <MDBCol md="1" size="2">
                {/* <MDBIcon icon="book" size="2x" className="cyan-text" /> */}
                {/* <MDBIcon fab icon="far fa-smile-beam fa-spin" size="2x" className="cyan-text" />
              </MDBCol> */} 
              <MDBCol md="11" size="10">
                <h3 className="font-weight-bold mb-3 text-monospace">Découvrez nous !</h3>
                <p className="dark-text text-muted text-monospace lead ">
                
                  Lorem ipsum dolor sit amet, consectetur adipisicing.
                  Reprehenderit maiores nam, aperiam minima elit assumenda
                  voluptate velit.
                  Lorem ipsum dolor sit amet, consectetur adipisicing.
                  Reprehenderit maiores nam, aperiam minima elit assumenda
                  voluptate velit.
                </p>
                
              </MDBCol>
            </MDBRow>
            <MDBRow className="mb-3">
            <MDBCol md="1" size="2">
                {/* <MDBIcon far icon="smile" size="2x" className="blue-text" /> */}
                <MDBIcon icon="suitcase" size="2x" className="blue-text"/>
              </MDBCol>
              <MDBCol md="11" size="10">
                <h3 className="font-weight-bold mb-3 text-monospace">De jolis séjours</h3>
                <p className="dark-text text-muted text-monospace lead">
                  Lorem ipsum dolor sit amet, consectetur adipisicing.
                  Reprehenderit maiores nam, aperiam minima elit assumenda
                  voluptate velit.
                  Lorem ipsum dolor sit amet, consectetur adipisicing.
                  Reprehenderit maiores nam, aperiam minima elit assumenda
                  voluptate velit.
                </p>
              </MDBCol>
            </MDBRow>

            {/* ////// */}
        <MDBRow className="mb-3">
              <MDBCol md="1" size="2">
                {/* <MDBIcon icon="book" size="2x" className="cyan-text" /> */}
                <MDBIcon fab icon="accessible-icon" size="2x" className="cyan-text" />
              </MDBCol>
              <MDBCol md="11" size="10">
                <h3 className="font-weight-bold mb-3 text-monospace">Des activités pour tous</h3>
                <p className="dark-text text-muted text-monospace lead">
                  Lorem ipsum dolor sit amet, consectetur adipisicing.
                  Reprehenderit maiores nam, aperiam minima elit assumenda
                  voluptate velit.
                  Lorem ipsum dolor sit amet, consectetur adipisicing.
                  Reprehenderit maiores nam, aperiam minima elit assumenda
                  voluptate velit.
                </p>
              </MDBCol>
            </MDBRow>
            
            <MDBRow className="mb-3">
            <MDBCol md="1" size="2">
                <MDBIcon icon="briefcase-medical" size="2x" className="pink-text"/>
              </MDBCol>
              <MDBCol md="11" size="10">
                <h3 className="font-weight-bold mb-3 text-monospace">Des soins adaptés, une assistance sur place</h3>
                <p className="dark-text text-muted text-monospace lead">
                  Lorem ipsum dolor sit amet, consectetur adipisicing.
                  Reprehenderit maiores nam, aperiam minima elit assumenda
                  voluptate velit.
                  Lorem ipsum dolor sit amet, consectetur adipisicing.
                  Reprehenderit maiores nam, aperiam minima elit assumenda
                  voluptate velit.
                </p>
              </MDBCol>
            </MDBRow>
          </MDBCol>
          <MDBCol lg="5">
            <img
              // src="https://mdbootstrap.com/img/Photos/Others/images/82.jpg"
              src="https://i.ibb.co/5WzzW03/logo2.png"
              alt=""
              className="img-fluid rounded z-depth-2 ml-2" height="700" width="700"
            />
          </MDBCol>
        </MDBRow>
      </section>
    )
  }
}


export default homePrez;