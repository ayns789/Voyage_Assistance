import * as React from "react";
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
      <div className="head">
        <header>
          

          <MDBView src="https://mdbootstrap.com/img/Photos/Others/img%20(50).jpg" className="d-block w-100 h-50">
            <MDBMask overlay="black-light" className="flex-center flex-column text-white text-center">
              <h1>Voyage Assistance</h1>
              <h3><strong>L'organisme de voyages sur mesure</strong></h3>
              <br />
              <p><strong>Nous sommes là pour vous amener ailleurs ! </strong></p>
            </MDBMask>
          </MDBView>
        </header>
      </div>
    );
  }
}

export default Header;
