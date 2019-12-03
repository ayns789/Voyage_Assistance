import * as React from "react";
// import Slides from "./slide";
import { MDBMask, MDBView } from "mdbreact";
import "../../less/components/header.less";

class Header extends React.Component {
  constructor(props) {
    super(props);
  }
  render() {
    return (
      // <Slides />
      // <h1>Home</h1>
      // <div>
        <div className="head">
          

          <MDBView src="https://mdbootstrap.com/img/Photos/Others/img%20(50).jpg" className="d-block w-100 h-50">
            <MDBMask overlay="black-light" className="flex-center flex-column text-white text-center">
              <h1>Voyage Assistance</h1>
              <br />
              <h2><strong>L'organisme de voyages sur mesure</strong></h2>
              
              <p><strong>Nous sommes là pour vous amener ailleurs ! </strong></p>
            </MDBMask>
          </MDBView>
        </div>
      //  </div> 
    );
  }
}

export default Header;
