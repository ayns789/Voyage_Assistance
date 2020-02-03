import * as React from "react";
import { Redirect } from "react-router-dom";

class Logout extends React.Component {

  logout(){
    localStorage.clear();
    location.href = "/login";
  }

  render() {
    
    this.logout();


    return (
      <React.Fragment></React.Fragment>
    );
  }
}
export default Logout;