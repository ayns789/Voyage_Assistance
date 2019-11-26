import React from "react";
import { MDBRow, MDBCol, MDBCard, MDBCardBody, MDBIcon, MDBBtn, MDBInput } from "mdbreact";

const contactSub = () => {
  return (
    <section className="my-5 pr-4 pl-4">
      <h2 className="h1-responsive font-weight-bold text-center my-5 deep-purple-text">
        Contactez nous
      </h2>
      <p className="text-center w-responsive mx-auto pb-5">
        Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fugit,
        error amet numquam iure provident voluptate esse quasi, veritatis
        totam voluptas nostrum quisquam eum porro a pariatur veniam.
      </p>
      <MDBRow>
        <MDBCol lg="5" className="lg- mb-4">
          <MDBCard>
            <MDBCardBody>
              <div className="form-header blue accent-1 z-depth-1 rounded mb-0">
                <h3 className="mt-2 ml-2 pt-2 pb-2">
                  <MDBIcon icon="envelope" /> Pour nous écrire :
                </h3>
              </div>
              
              <div className="md-form">
                <MDBInput 
                  icon="user"
                  label="Votre nom"
                  iconClass="grey-text"
                  type="text"
                  id="form-name"
                />
              </div>
              <div className="md-form">
                <MDBInput
                  icon="envelope"
                  label="Votre email"
                  iconClass="grey-text"
                  type="text"
                  id="form-email"
                />
              </div>
              <div className="md-form">
                <MDBInput
                  icon="tag"
                  label="Sujet"
                  iconClass="grey-text"
                  type="text"
                  id="form-subject"
                />
              </div>
              <div className="md-form">
                <MDBInput
                  icon="pencil-alt"
                  label="Votre message"
                  iconClass="grey-text"
                  type="textarea"
                  id="form-text"
                />
              </div>
              <div className="text-center">
                <MDBBtn color="light-blue">Envoyer</MDBBtn>
              </div>
            </MDBCardBody>
          </MDBCard>
        </MDBCol>
        <MDBCol lg="7">
          <div
            id="map-container"
            className="rounded z-depth-1-half map-container"
            style={{ height: "400px" }}
          >
            <iframe
              src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d76765.98321148289!2d-73.96694563267306!3d40.751663750099084!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1spl!2spl!4v1525939514494"
              title="This is a unique title"
              width="100%"
              height="100%"
              frameBorder="0"
              style={{ border: 0 }}
            />
          </div>
          <br />
          <MDBRow className="text-center">
            <MDBCol md="4">
              <MDBBtn tag="a" floating color="blue" className="accent-1 rounded-circle">
                <MDBIcon icon="map-marker-alt" />
              </MDBBtn>
              <p>Paris, 75020</p>
              <p className="mb-md-0">France</p>
            </MDBCol>
            <MDBCol md="4">
              <MDBBtn tag="a" floating color="blue" className="accent-1 rounded-circle">
                <MDBIcon icon="phone" />
              </MDBBtn>
              <p>++33 1 34 56 89 71</p>
              <p className="mb-md-0">Lundi - Vendredi, 9:00-19:00</p>
            </MDBCol>
            <MDBCol md="4">
              <MDBBtn tag="a" floating color="blue" className="accent-1 rounded-circle">
                <MDBIcon icon="envelope" />
              </MDBBtn>
              <p>info@voyage-assistance.com</p>
              <p className="mb-md-0">contact@voyage-assistance.com</p>
            </MDBCol>
          </MDBRow>
        </MDBCol>
      </MDBRow>
    </section>
  );
}

export default contactSub;

// import React from "react";
// import { MDBContainer, MDBRow, MDBCol, MDBBtn, MDBIcon, MDBInput } from "mdbreact";

// const contactSub = () => {
//   return (
    
//     <MDBContainer>
//       <MDBRow>
//         <MDBCol size="10" md="12">
//           <form>
//             <h2 className="h2 text-center py-4">Contactez nous</h2>
//             <div className="grey-text">
//               <MDBInput
//                 label="Votre nom"
//                 icon="user"
//                 group
//                 type="text"
//                 validate
//                 error="wrong"
//                 success="right"
//               />
//               <MDBInput
//                 label="Votre email"
//                 icon="envelope"
//                 group
//                 type="email"
//                 validate
//                 error="wrong"
//                 success="right"
//               />
//               <MDBInput
//                 label="Sujet"
//                 icon="tag"
//                 group
//                 type="text"
//                 validate
//                 error="wrong"
//                 success="right"
//               />
//               <MDBInput
//                 type="textarea"
//                 rows="2"
//                 label="Votre message"
//                 icon="pencil-alt"
//               />
//             </div>
//             <div className="text-center">
//               <MDBBtn outline color="secondary">
//                 Envoyer <MDBIcon far icon="paper-plane" className="ml-1" />
//               </MDBBtn>
//             </div>
//           </form>
//         </MDBCol>
//       </MDBRow>
//     </MDBContainer>
    
    
//   );
// };

// export default contactSub;