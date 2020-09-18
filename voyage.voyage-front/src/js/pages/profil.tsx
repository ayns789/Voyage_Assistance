
import React from "react";
import ModalModifPage from "../components/modalModifProfil";
import {  MDBRow, MDBCol, MDBCard, MDBCardBody, MDBMask, MDBIcon, MDBView } from "mdbreact";

class ProfilPage extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      username: "",
      firstName:"", 
      lastName:"",
      refresh_token:"",
      isLoaded: false,
    }
  }

  componentDidMount() {
    const userId = localStorage.getItem("user_id");
            // alert( "id user: " + userId);
    
    const url = "http://localhost:8282/api/account/get/" + userId;
    
    const headers = new Headers({
                        "Accept": "application/json",
                      "Content-Type": "application/json"});
                
                      fetch( url, {
                        method: "GET",
                        headers,
                        mode: "cors"
                      })
      .then(res => {return res.json();})
      .then(json => {
        this.setState({
          isLoaded: true,
          username: json.username,
          firstName: json.firstName, 
          lastName: json.lastName,
          refresh_token: json.refresh_token
            })
            alert(this.state.refresh_token);
            localStorage.setItem("refresh_token", this.state.refresh_token);
            localStorage.setItem("user_id", userId);
      });
      // alert(this.state.username);
  }
  render() {
    const username = this.state.username;
    const firstName = this.state.firstName;
    const lastName = this.state.lastName;
    

      return (
        <React.Fragment>
<MDBCard
            className="my-5 px-5 mx-auto"
            style={{ fontWeight: 300, maxWidth: "60%" }}
          >
            <MDBCardBody style={{ paddingTop: 0 }}>
              <h2 className="h1-responsive font-weight-bold my-5 text-center">
                Bienvenue "{username}"
              </h2>
              
              
              {/* <MDBRow> */}
                <MDBCol md="12" lg="12">
                  <div className="mb-4">
                    <MDBView hover rounded className="z-depth-1-half mb-4">
                      <img
                        className="img-fluid"
                        src="https://mdbootstrap.com/img/Photos/Slides/1.jpg"
                        alt=""
                      />
                      <a href="#!">
                        <MDBMask overlay="white-slight" className="waves-light" />
                      </a>
                    </MDBView>
                    <div className="d-flex justify-content-between">
                      <a href="#!" className="deep-orange-text">
                        <h6 className="font-weight-bold">
                          <MDBIcon icon="address-card" className="pr-2" />
                          Profil
                        </h6>
                      </a>
                      
                    </div>
                    <h3 className="font-weight-bold dark-grey-text mb-3 p-0">
                      <a href="#!">{firstName} {lastName}</a>
                    </h3>
                    <p className="dark-grey-text mb-lg-0 mb-md-5 mb-4">
                      Sed ut perspiciatis unde voluptatem omnis iste natus error sit
                      voluptatem accusantium doloremque laudantium, totam rem
                      aperiam, eaque ipsa quae ab illo inventore veritatis et quasi
                      architecto beatae vitae explicabo. Duis aute irure dolor in
                      reprehenderit in voluptate velit esse cillum dolore eu fugiat.
                    </p>
                  </div>
                </MDBCol>

                
                <p className="text-center">
                <ModalModifPage />
                </p>
                


                <MDBCol md="12" lg="12">
                  <div style={{
                    borderBottom: "1px solid #e0e0e0",
                    marginBottom: "1.5rem"
                  }}>
                    <MDBRow>
                      <MDBCol md="3">
                        <MDBView hover rounded className="z-depth-1-half mb-4">
                          <img
                            className="img-fluid"
                            src="https://mdbootstrap.com/img/Photos/Others/img%20(29).jpg"
                            alt=""
                          />
                          <a href="#!">
                            <MDBMask overlay="white-slight" className="waves-light" />
                          </a>
                        </MDBView>
                      </MDBCol>
                      <MDBCol md="9">
                        <p className="font-weight-bold dark-grey-text">
                          26/02/2018
                        </p>
                        <div className="d-flex justify-content-between">
                          <MDBCol size="11" className="text-truncate pl-0 mb-3">
                            <a href="#!" className="dark-grey-text">
                              At vero eos et accusamus et iusto odio dignissimos
                              ducimus qui blanditiis
                            </a>
                          </MDBCol>
                          <a href="#!">
                            <MDBIcon icon="angle-double-right" />
                          </a>
                        </div>
                      </MDBCol>
                    </MDBRow>
                  </div>
    
                  <div style={{
                    borderBottom: "1px solid #e0e0e0",
                    marginBottom: "1.5rem"
                  }}>
                    <MDBRow>
                      <MDBCol md="3">
                        <MDBView hover rounded className="z-depth-1-half mb-4">
                          <img
                            className="img-fluid"
                            src="https://mdbootstrap.com/img/Photos/Horizontal/Food/4-col/img%20(45).jpg"
                            alt=""
                          />
                          <a href="#!">
                            <MDBMask overlay="white-slight" className="waves-light" />
                          </a>
                        </MDBView>
                      </MDBCol>
                      <MDBCol md="9">
                        <p className="font-weight-bold dark-grey-text">
                          25/02/2018
                        </p>
                        <div className="d-flex justify-content-between">
                          <MDBCol size="11" className="text-truncate pl-0 mb-3">
                            <a href="#!" className="dark-grey-text">
                              Itaque earum rerum hic tenetur a sapiente delectus
                            </a>
                          </MDBCol>
                          <a href="#!">
                            <MDBIcon icon="angle-double-right" />
                          </a>
                        </div>
                      </MDBCol>
                    </MDBRow>
                  </div>
    
                  <div style={{
                        borderBottom: "1px solid #e0e0e0",
                        marginBottom: "1.5rem"
                      }}>
                    <MDBRow>
                      <MDBCol md="3">
                        <MDBView hover rounded className="z-depth-1-half mb-4">
                          <img
                            className="img-fluid"
                            src="https://mdbootstrap.com/img/Photos/Others/images/87.jpg"
                            alt=""
                          />
                          <a href="#!">
                            <MDBMask overlay="white-slight" className="waves-light" />
                          </a>
                        </MDBView>
                      </MDBCol>
                      <MDBCol md="9">
                        <p className="font-weight-bold dark-grey-text">
                          24/03/2018
                        </p>
                        <div className="d-flex justify-content-between">
                          <MDBCol size="11" className="text-truncate pl-0 mb-3">
                            <a href="#!" className="dark-grey-text">
                              Soluta nobis est eligendi optio cumque nihil impedit
                              quo minus
                            </a>
                          </MDBCol>
                          <a href="#!">
                            <MDBIcon icon="angle-double-right" />
                          </a>
                        </div>
                      </MDBCol>
                    </MDBRow>
                  </div>
    
                  <div className="mb-4">
                    <MDBRow>
                      <MDBCol md="3">
                        <MDBView hover rounded className="z-depth-1-half mb-4">
                          <img
                            className="img-fluid"
                            src="https://mdbootstrap.com/img/Photos/Others/img%20(27).jpg"
                            alt=""
                          />
                          <a href="#!">
                            <MDBMask overlay="white-slight" className="waves-light" />
                          </a>
                        </MDBView>
                      </MDBCol>
                      <MDBCol md="9">
                        <p className="font-weight-bold dark-grey-text">
                          23/02/2018
                        </p>
                        <div className="d-flex justify-content-between">
                          <MDBCol size="11" className="text-truncate pl-0 mb-3">
                            <a href="#!" className="dark-grey-text">
                              Duis aute irure dolor in reprehenderit in voluptate
                            </a>
                          </MDBCol>
                          <a href="#!">
                            <MDBIcon icon="angle-double-right" />
                          </a>
                        </div>
                      </MDBCol>
                    </MDBRow>
                  </div>
                </MDBCol>
              {/* </MDBRow> */}
            </MDBCardBody>
          </MDBCard>

        </React.Fragment>
      //   <React.Fragment>
      //   <div >
      //     <h1>Page profil</h1>
      //     <br />
      //    <h2><strong>Nom d'utilisateur : {username}</strong></h2>
      //    <h4>Nom : {firstName}</h4>
      //    <h4>Prénom : {lastName}</h4>
      // </div>
      // </React.Fragment>
      )
    
  }
}
export default ProfilPage;
