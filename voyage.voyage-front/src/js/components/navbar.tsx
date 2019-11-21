
import React from "react";
import { MDBNavbar, MDBNavbarBrand, MDBNavbarNav, MDBNavbarToggler, MDBNavLink, MDBCollapse, MDBNavItem,  MDBContainer, MDBMask, MDBView, MDBDropdown, MDBDropdownToggle, MDBIcon, MDBDropdownMenu, MDBDropdownItem } from "mdbreact";
import { BrowserRouter as Router, Link } from "react-router-dom";
import "../../less/components/navbar.less";
// MDBNavLink,

class FullPageIntroWithFixedNavbar extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      collapse: false,
      isWideEnough: false
    };
    this.onClick = this.onClick.bind(this);
  }

  onClick() {
    this.setState({
      collapse: !this.state.collapse
    });
  }

//   réglage position onglets :
//   className="white-text mr-4  pt-6 pb-6">

  render() {
    return (
      <div>
        <header>
            <MDBNavbar color="indigo" dark expand="md" fixed="top">
              <MDBNavbarBrand href="/">
                <strong>Voyage Assistance</strong>
              </MDBNavbarBrand>
              {!this.state.isWideEnough && <MDBNavbarToggler onClick={this.onClick} />}
              {/* ou pour réglage menu hamburger :
               <MDBHamburgerToggler color="black" id="hamburger1" onClick={()=> this.toggleSingleCollapse('collapse1')} /> */}
              <MDBCollapse isOpen={this.state.collapse} navbar>
                <MDBNavbarNav left>
                  <MDBNavItem active>
                    <Link to="/" className="white-text mr-3  pt-6 pb-6">Accueil</Link>
                  </MDBNavItem>
                  <MDBNavItem>
                    <Link to="/sejours" className="white-text mr-3 pt-6 pb-6">Séjours</Link>
                  </MDBNavItem>
                  <MDBNavItem>
                    <Link to="/services" className="white-text mr-3 pt-6 pb-6">Services</Link>
                  </MDBNavItem>
                  <MDBNavItem>
                    <Link to="/activites" className="white-text mr-3 pt-6 pb-6">Activités</Link>
                  </MDBNavItem>
                  <MDBNavItem>
                    <Link to="/contact" className="white-text mr-3 pt-6 pb-6">Contact</Link>
                  </MDBNavItem>
                  </MDBNavbarNav>
                  <MDBNavbarNav right>
                  <MDBNavItem>
               <MDBDropdown>
                 <MDBDropdownToggle nav caret>
                   <MDBIcon icon="user" />
                 </MDBDropdownToggle>
                 <MDBDropdownMenu className="dropdown-default">
                 <MDBDropdownItem><Link to="/login" className="dark-text mr-3 pt-6 pb-6">Mon compte</Link></MDBDropdownItem>
                   <MDBDropdownItem href="#!">Another Action</MDBDropdownItem>
                   <MDBDropdownItem href="#!">Something else here</MDBDropdownItem>
                   <MDBDropdownItem href="#!">Something else here</MDBDropdownItem>
                 </MDBDropdownMenu>
               </MDBDropdown>
             </MDBNavItem>
                </MDBNavbarNav>
              </MDBCollapse>
            </MDBNavbar>
        </header>
      </div>
    );
  }
}

export default FullPageIntroWithFixedNavbar;
