import React from "react";
import { MDBCarousel, MDBCarouselInner, MDBCarouselItem, MDBContainer, MDBRow, MDBCol, MDBCard, MDBCardImage,
MDBCardBody, MDBCardTitle, MDBCardText, MDBBtn } from "mdbreact";

const MultiCarouselPage = () => {
  return (
    <MDBContainer>
      <MDBCarousel activeItem={1} length={3} slide={true} showControls={true} showIndicators={true} multiItem>
        <MDBCarouselInner>
          <MDBRow md="6" className="d-flex justify-content-center align-items-center mt-3">
            <MDBCarouselItem itemId="1">
              <MDBCol md="4">
                <MDBCard className="mb-2">
                  <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(34).jpg" />
                  <MDBCardBody>
                    <MDBCardTitle>MDBCard title</MDBCardTitle>
                    <MDBCardText>
                      Some quick example text to build on the card title and
                      make up the bulk of the card's content.
                    </MDBCardText>
                    <MDBBtn color="primary">MDBBtn</MDBBtn>
                  </MDBCardBody>
                </MDBCard>
              </MDBCol>
              <MDBCol md="4">
                <MDBCard className="mb-2">
                  <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(18).jpg" />
                  <MDBCardBody>
                    <MDBCardTitle>MDBCard title</MDBCardTitle>
                    <MDBCardText>
                      Some quick example text to build on the card title and
                      make up the bulk of the card's content.
                    </MDBCardText>
                    <MDBBtn color="primary">MDBBtn</MDBBtn>
                  </MDBCardBody>
                </MDBCard>
              </MDBCol>
              <MDBCol md="4">
                <MDBCard className="mb-2">
                  <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(35).jpg" />
                  <MDBCardBody>
                    <MDBCardTitle>MDBCard title</MDBCardTitle>
                    <MDBCardText>
                      Some quick example text to build on the card title and
                      make up the bulk of the card's content.
                    </MDBCardText>
                    <MDBBtn color="primary">MDBBtn</MDBBtn>
                  </MDBCardBody>
                </MDBCard>
              </MDBCol>
            </MDBCarouselItem>
            <MDBCarouselItem itemId="2">
              <MDBCol md="4">
                <MDBCard className="mb-2">
                  <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(60).jpg" />
                  <MDBCardBody>
                    <MDBCardTitle>MDBCard title</MDBCardTitle>
                    <MDBCardText>
                      Some quick example text to build on the card title and
                      make up the bulk of the card's content.
                    </MDBCardText>
                    <MDBBtn color="primary">MDBBtn</MDBBtn>
                  </MDBCardBody>
                </MDBCard>
              </MDBCol>
              <MDBCol md="4">
                <MDBCard className="mb-2">
                  <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(47).jpg" />
                  <MDBCardBody>
                    <MDBCardTitle>MDBCard title</MDBCardTitle>
                    <MDBCardText>
                      Some quick example text to build on the card title and
                      make up the bulk of the card's content.
                    </MDBCardText>
                    <MDBBtn color="primary">MDBBtn</MDBBtn>
                  </MDBCardBody>
                </MDBCard>
              </MDBCol>
              <MDBCol md="4">
                <MDBCard className="mb-2">
                  <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(48).jpg" />
                  <MDBCardBody>
                    <MDBCardTitle>MDBCard title</MDBCardTitle>
                    <MDBCardText>
                      Some quick example text to build on the card title and
                      make up the bulk of the card's content.
                    </MDBCardText>
                    <MDBBtn color="primary">MDBBtn</MDBBtn>
                  </MDBCardBody>
                </MDBCard>
              </MDBCol>
            </MDBCarouselItem>
            <MDBCarouselItem itemId="3">
              <MDBCol md="4">
                <MDBCard className="mb-2">
                  <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(53).jpg" />
                  <MDBCardBody>
                    <MDBCardTitle>MDBCard title</MDBCardTitle>
                    <MDBCardText>
                      Some quick example text to build on the card title and
                      make up the bulk of the card's content.
                    </MDBCardText>
                    <MDBBtn color="primary">MDBBtn</MDBBtn>
                  </MDBCardBody>
                </MDBCard>
              </MDBCol>
              <MDBCol md="4">
                <MDBCard className="mb-2">
                  <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(45).jpg" />
                  <MDBCardBody>
                    <MDBCardTitle>MDBCard title</MDBCardTitle>
                    <MDBCardText>
                      Some quick example text to build on the card title and
                      make up the bulk of the card's content.
                    </MDBCardText>
                    <MDBBtn color="primary">MDBBtn</MDBBtn>
                  </MDBCardBody>
                </MDBCard>
              </MDBCol>
              <MDBCol md="4">
                <MDBCard className="mb-2">
                  <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(41).jpg" />
                  <MDBCardBody>
                    <MDBCardTitle>MDBCard title</MDBCardTitle>
                    <MDBCardText>
                      Some quick example text to build on the card title and
                      make up the bulk of the card's content.
                    </MDBCardText>
                    <MDBBtn color="primary">MDBBtn</MDBBtn>
                  </MDBCardBody>
                </MDBCard>
              </MDBCol>
            </MDBCarouselItem>
          </MDBRow>
        </MDBCarouselInner>
      </MDBCarousel>
    </MDBContainer>
  );
}

export default MultiCarouselPage;


/////////////////////////////
////////////////////////////
///////////////////////////

// import React from "react";
// import {  MDBRow, MDBCol, MDBCardBody, MDBIcon, MDBBtn, MDBView, MDBMask } from "mdbreact";

// const ProjectsPage = () => {
//   return (
//     <section className="text-center my-5 pr-4 pl-4">
//       <h2 className="h1-responsive font-weight-bold my-5">
//         Our best projects
//       </h2>
//       <p className="grey-text w-responsive mx-auto mb-5">
//         Duis aute irure dolor in reprehenderit in voluptate velit esse
//         cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat
//         cupidatat non proident, sunt in culpa qui officia deserunt mollit
//         est laborum.
//       </p>

//       <MDBRow className="text-center">
//         <MDBCol lg="4" md="12" className="mb-lg-0 mb-4">
//           <MDBView className="overlay rounded z-depth-1" waves>
//             <img
//               src="https://mdbootstrap.com/img/Photos/Others/images/58.jpg"
//               alt=""
//               className="img-fluid"
//             />
//             <a href="#!">
//               <MDBMask overlay="white-slight" />
//             </a>
//           </MDBView>
//           <MDBCardBody className="pb-0">
//             <h4 className="font-weight-bold my-3">Title of the news</h4>
//             <p className="grey-text">
//               Temporibus autem quibusdam et aut officiis debitis aut rerum
//               necessitatibus saepe eveniet ut et voluptates repudiandae.
//             </p>
//             <MDBBtn color="indigo" size="sm">
//               <MDBIcon far icon="clone" className="left" /> MDBView project
//             </MDBBtn>
//           </MDBCardBody>
//         </MDBCol>
//         <MDBCol lg="4" md="12" className="mb-lg-0 mb-4">
//           <MDBView className="overlay rounded z-depth-1" waves>
//             <img
//               src="https://mdbootstrap.com/img/Photos/Others/project4.jpg"
//               alt=""
//               className="img-fluid"
//             />
//             <a href="#!">
//               <MDBMask overlay="white-slight" />
//             </a>
//           </MDBView>
//           <MDBCardBody className="pb-0">
//             <h4 className="font-weight-bold my-3">Title of the news</h4>
//             <p className="grey-text">
//               Temporibus autem quibusdam et aut officiis debitis aut rerum
//               necessitatibus saepe eveniet ut et voluptates repudiandae.
//             </p>
//             <MDBBtn color="indigo" size="sm">
//               <MDBIcon far icon="clone" className="left" /> MDBView project
//             </MDBBtn>
//           </MDBCardBody>
//         </MDBCol>
//         <MDBCol lg="4" md="12" className="mb-lg-0 mb-4">
//           <MDBView className="overlay rounded z-depth-1" waves>
//             <img
//               src="https://mdbootstrap.com/img/Photos/Others/images/88.jpg"
//               alt=""
//               className="img-fluid"
//             />
//             <a href="#!">
//               <MDBMask overlay="white-slight" />
//             </a>
//           </MDBView>
//           <MDBCardBody className="pb-0">
//             <h4 className="font-weight-bold my-3">Title of the news</h4>
//             <p className="grey-text">
//               Temporibus autem quibusdam et aut officiis debitis aut rerum
//               necessitatibus saepe eveniet ut et voluptates repudiandae.
//             </p>
//             <MDBBtn color="indigo" size="sm">
//               <MDBIcon far icon="clone" className="left" /> MDBView project
//             </MDBBtn>
//           </MDBCardBody>
//         </MDBCol>
//       </MDBRow>
//     </section>
//   );
// }

// export default ProjectsPage;