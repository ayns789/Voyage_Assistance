import * as React from "react";
import { func } from "prop-types";
import {  MDBRow, MDBCol, MDBIcon, MDBBtn, MDBCard, MDBCardBody, MDBMask, MDBView, MDBBadge } from "mdbreact";
import Prez from "../components/prezSociete";
import Redire from "../components/homeRedirections";
import Sub from "../components/newsletter";

class Home extends React.Component {
  render() {

    return(
      <div>
      <Prez />

      <Redire />

      <Sub />
      </div>
   
    )
  }
}


export default Home;
