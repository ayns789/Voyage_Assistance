import * as React from "react";
import Slides from "./slide";
import { MDBNavbar, MDBNavbarBrand, MDBNavbarNav, MDBNavbarToggler, MDBNavLink, MDBCollapse, MDBNavItem,  MDBContainer, MDBMask, MDBView, MDBDropdown, MDBDropdownToggle, MDBIcon, MDBDropdownMenu, MDBDropdownItem } from "mdbreact";


class Header extends React.Component {
  render() {
    return (
      // <Slides />
      // <h1>Home</h1>
      <div>
        <header>
          

          <MDBView src="https://mdbootstrap.com/img/Photos/Others/img%20(50).jpg" className="d-block w-100 h-50">
            <MDBMask overlay="black-light" className="flex-center flex-column text-white text-center">
              <h1>Voyage Assistance</h1>
              <h5><strong>L'organisme de voyages sur mesure</strong></h5>
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
