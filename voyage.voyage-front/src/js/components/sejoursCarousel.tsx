import React from "react";
import { MDBRow, MDBCol, MDBCard, MDBCardImage, MDBCardBody, MDBCardTitle, MDBCardText, MDBCardFooter,  MDBTooltip } from "mdbreact";

const EcommercePage = () => {
  return (
    <section className="text-center my-5">
      <h2 className="h1-responsive font-weight-bold text-center my-5">
        Our bestsellers
      </h2>
      <p className="grey-text text-center w-responsive mx-auto mb-5">
        Lorem ipsum dolor sit amet, consectetur adipisicing elit. Fugit,
        error amet numquam iure provident voluptate esse quasi, veritatis
        totam voluptas nostrum quisquam eum porro a pariatur veniam.
      </p>
      <MDBRow>
        <MDBCol lg="4" md="12" className="mb-lg-0 mb-4">
          <MDBCard wide ecommerce>
            <MDBCardImage
              cascade
              src="https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Products/img (55).jpg"
              top
              alt="sample photo"
            />
            <MDBCardBody cascade className="text-center">
              <a href="#!" className="text-muted">
                <h5>Camera</h5>
              </a>
              <MDBCardTitle>
                <strong>
                  <a href="#!">GoPro</a>
                </strong>
              </MDBCardTitle>
              <MDBCardText>
                Lorem ipsum dolor sit amet, consectetur adipisicing minima
                veniam elit.
              </MDBCardText>
              <MDBCardFooter className="px-1">
                <span className="float-left font-weight-bold">
                  <strong>1439$</strong>
                </span>
                <span className="float-right">
                  <MDBTooltip
                    placement="top"
                    tag="a"
                    component="i"
                    componentClass="fa fa-eye grey-text ml-3"
                    tooltipContent="Quick look"
                  />
                  <MDBTooltip
                    placement="top"
                    tag="a"
                    component="i"
                    componentClass="fa fa-heart grey-text ml-3"
                    tooltipContent="Add to watchlist"
                  />
                </span>
              </MDBCardFooter>
            </MDBCardBody>
          </MDBCard>
        </MDBCol>
        <MDBCol lg="4" md="12" className="mb-lg-0 mb-4">
          <MDBCard wide ecommerce>
            <MDBCardImage
              cascade
              src="https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Products/img (49).jpg"
              top
              alt="sample photo"
            />
            <MDBCardBody cascade className="text-center">
              <a href="#!" className="text-muted">
                <h5>Photography</h5>
              </a>
              <MDBCardTitle>
                <strong>
                  <a href="#!">Camera</a>
                </strong>
              </MDBCardTitle>
              <MDBCardText>
                Lorem ipsum dolor sit amet, consectetur adipisicing minima
                veniam elit.
              </MDBCardText>
              <MDBCardFooter className="px-1">
                <span className="float-left font-weight-bold">
                  <strong>1160$</strong>
                </span>
                <span className="float-right">
                  <MDBTooltip
                    placement="top"
                    tag="a"
                    component="i"
                    componentClass="fa fa-eye grey-text ml-3"
                    tooltipContent="Quick look"
                  />
                  <MDBTooltip
                    placement="top"
                    tag="a"
                    component="i"
                    componentClass="fa fa-heart grey-text ml-3"
                    tooltipContent="Add to watchlist"
                  />
                </span>
              </MDBCardFooter>
            </MDBCardBody>
          </MDBCard>
        </MDBCol>
        <MDBCol lg="4" md="12" className="mb-lg-0 mb-4">
          <MDBCard wide ecommerce>
            <MDBCardImage
              cascade
              src="https://mdbootstrap.com/img/Photos/Horizontal/E-commerce/Products/img (56).jpg"
              top
              alt="sample photo"
            />
            <MDBCardBody cascade className="text-center">
              <a href="#!" className="text-muted">
                <h5>Smartphone</h5>
              </a>
              <MDBCardTitle>
                <strong>
                  <a href="#!">iPhone 6S</a>
                </strong>
              </MDBCardTitle>
              <MDBCardText>
                Lorem ipsum dolor sit amet, consectetur adipisicing minima
                veniam elit.
              </MDBCardText>
              <MDBCardFooter className="px-1">
                <span className="float-left font-weight-bold">
                  <strong>2160$</strong>
                </span>
                <span className="float-right">
                  <MDBTooltip
                    placement="top"
                    tag="a"
                    component="i"
                    componentClass="fa fa-eye grey-text ml-3"
                    tooltipContent="Quick look"
                  />
                  <MDBTooltip
                    placement="top"
                    tag="a"
                    component="i"
                    componentClass="fa fa-heart grey-text ml-3"
                    tooltipContent="Add to watchlist"
                  />
                </span>
              </MDBCardFooter>
            </MDBCardBody>
          </MDBCard>
        </MDBCol>
      </MDBRow>
    </section>
  );
}

export default EcommercePage;


// import React from "react";
// import { MDBCarousel, MDBCarouselInner, MDBCarouselItem, MDBContainer, MDBRow, MDBCol, MDBCard, MDBCardImage,
// MDBCardBody, MDBCardTitle, MDBCardText, MDBBtn } from "mdbreact";

// const MultiCarouselPage = () => {
//   return (
//     <div>
//     <MDBContainer className="mt-3">
//       <MDBCarousel activeItem={1} length={3} slide={true} showControls={true} showIndicators={true} multiItem>
//       <MDBRow md="6" className="d-flex justify-content-center align-items-center mt-3">
//         <MDBCarouselInner>
          
//             <MDBCarouselItem itemId="1">
//               <MDBCol md="4">
//                 <MDBCard className="mb-2">
//                   <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(34).jpg" />
//                   <MDBCardBody>
//                     <MDBCardTitle>MDBCard title</MDBCardTitle>
//                     <MDBCardText>
//                       Some quick example text to build on the card title and
//                       make up the bulk of the card's content.
//                     </MDBCardText>
//                     <MDBBtn color="primary">MDBBtn</MDBBtn>
//                   </MDBCardBody>
//                 </MDBCard>
//               </MDBCol>
//               <MDBCol md="4">
//                 <MDBCard className="mb-2">
//                   <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(18).jpg" />
//                   <MDBCardBody>
//                     <MDBCardTitle>MDBCard title</MDBCardTitle>
//                     <MDBCardText>
//                       Some quick example text to build on the card title and
//                       make up the bulk of the card's content.
//                     </MDBCardText>
//                     <MDBBtn color="primary">MDBBtn</MDBBtn>
//                   </MDBCardBody>
//                 </MDBCard>
//               </MDBCol>
//               <MDBCol md="4">
//                 <MDBCard className="mb-2">
//                   <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(35).jpg" />
//                   <MDBCardBody>
//                     <MDBCardTitle>MDBCard title</MDBCardTitle>
//                     <MDBCardText>
//                       Some quick example text to build on the card title and
//                       make up the bulk of the card's content.
//                     </MDBCardText>
//                     <MDBBtn color="primary">MDBBtn</MDBBtn>
//                   </MDBCardBody>
//                 </MDBCard>
//               </MDBCol>
//             </MDBCarouselItem>
//             <MDBCarouselItem itemId="2">
//               <MDBCol md="4">
//                 <MDBCard className="mb-2">
//                   <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(60).jpg" />
//                   <MDBCardBody>
//                     <MDBCardTitle>MDBCard title</MDBCardTitle>
//                     <MDBCardText>
//                       Some quick example text to build on the card title and
//                       make up the bulk of the card's content.
//                     </MDBCardText>
//                     <MDBBtn color="primary">MDBBtn</MDBBtn>
//                   </MDBCardBody>
//                 </MDBCard>
//               </MDBCol>
//               <MDBCol md="4">
//                 <MDBCard className="mb-2">
//                   <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(47).jpg" />
//                   <MDBCardBody>
//                     <MDBCardTitle>MDBCard title</MDBCardTitle>
//                     <MDBCardText>
//                       Some quick example text to build on the card title and
//                       make up the bulk of the card's content.
//                     </MDBCardText>
//                     <MDBBtn color="primary">MDBBtn</MDBBtn>
//                   </MDBCardBody>
//                 </MDBCard>
//               </MDBCol>
//               <MDBCol md="4">
//                 <MDBCard className="mb-2">
//                   <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(48).jpg" />
//                   <MDBCardBody>
//                     <MDBCardTitle>MDBCard title</MDBCardTitle>
//                     <MDBCardText>
//                       Some quick example text to build on the card title and
//                       make up the bulk of the card's content.
//                     </MDBCardText>
//                     <MDBBtn color="primary">MDBBtn</MDBBtn>
//                   </MDBCardBody>
//                 </MDBCard>
//               </MDBCol>
//             </MDBCarouselItem>
//             <MDBCarouselItem itemId="3">
//               <MDBCol md="4">
//                 <MDBCard className="mb-2">
//                   <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(53).jpg" />
//                   <MDBCardBody>
//                     <MDBCardTitle>MDBCard title</MDBCardTitle>
//                     <MDBCardText>
//                       Some quick example text to build on the card title and
//                       make up the bulk of the card's content.
//                     </MDBCardText>
//                     <MDBBtn color="primary">MDBBtn</MDBBtn>
//                   </MDBCardBody>
//                 </MDBCard>
//               </MDBCol>
//               <MDBCol md="4">
//                 <MDBCard className="mb-2">
//                   <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(45).jpg" />
//                   <MDBCardBody>
//                     <MDBCardTitle>MDBCard title</MDBCardTitle>
//                     <MDBCardText>
//                       Some quick example text to build on the card title and
//                       make up the bulk of the card's content.
//                     </MDBCardText>
//                     <MDBBtn color="primary">MDBBtn</MDBBtn>
//                   </MDBCardBody>
//                 </MDBCard>
//               </MDBCol>
//               <MDBCol md="4">
//                 <MDBCard className="mb-2">
//                   <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(41).jpg" />
//                   <MDBCardBody>
//                     <MDBCardTitle>MDBCard title</MDBCardTitle>
//                     <MDBCardText>
//                       Some quick example text to build on the card title and
//                       make up the bulk of the card's content.
//                     </MDBCardText>
//                     <MDBBtn color="primary">MDBBtn</MDBBtn>
//                   </MDBCardBody>
//                 </MDBCard>
//               </MDBCol>
//             </MDBCarouselItem>
          
//         </MDBCarouselInner>
//         </MDBRow>
//       </MDBCarousel>
//     </MDBContainer>
//     </div>
//   );
// }

// export default MultiCarouselPage;


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