// web
// mobile
// Rate these docs
   
// React Bootstrap Carousel
// React Carousel - Bootstrap 4 & Material Design
// React Bootstrap carousel is responsive and interactive slideshow which is created for presenting content, especially images and videos.

// The carousel is a slideshow for cycling through a series of content. It works with a series of images, text, or custom markup. It also includes support for previous/next controls and indicators.

// Please be aware that nested carousels are not supported, and carousels are generally not compliant with accessibility standards.

// Slides only
// Here’s a carousel with slides only. Note the presence of the .d-block and .w-100 on carousel images to prevent browser default image alignment.


// JSX
// import React from "react";
// import { MDBCarousel, MDBCarouselInner, MDBCarouselItem, MDBView, MDBContainer } from
// "mdbreact";

// const CarouselPage = () => {
//  return (
//    <MDBContainer>
//      <MDBCarousel
//        activeItem={1}
//        length={3}
//        showControls={false}
//        showIndicators={false}
//        className="z-depth-1"
//        slide
//      >
//        <MDBCarouselInner>
//          <MDBCarouselItem itemId="1">
//            <MDBView>
//              <img
//                className="d-block w-100"
//                src="https://mdbootstrap.com/img/Photos/Slides/img%20(35).jpg"
//                alt="First slide"
//              />
//            </MDBView>
//          </MDBCarouselItem>
//          <MDBCarouselItem itemId="2">
//            <MDBView>
//              <img
//                className="d-block w-100"
//                src="https://mdbootstrap.com/img/Photos/Slides/img%20(33).jpg"
//                alt="Second slide"
//              />
//            </MDBView>
//          </MDBCarouselItem>
//          <MDBCarouselItem itemId="3">
//            <MDBView>
//              <img
//                className="d-block w-100"
//                src="https://mdbootstrap.com/img/Photos/Slides/img%20(31).jpg"
//                alt="Third slide"
//              />
//            </MDBView>
//          </MDBCarouselItem>
//        </MDBCarouselInner>
//      </MDBCarousel>
//    </MDBContainer>
//  );
// }

// export default CarouselPage;
// // With controls
// // Adding in the previous and next controls:

// // Third slide
// // Previous
// // Next
// // JSX
// import React from "react";
// import { MDBCarousel, MDBCarouselInner, MDBCarouselItem, MDBView, MDBContainer } from
// "mdbreact";

// const CarouselPage = () => {
//  return (
//    <MDBContainer>
//      <MDBCarousel
//        activeItem={1}
//        length={3}
//        showControls={true}
//        showIndicators={false}
//        className="z-depth-1"
//        slide
//      >
//        <MDBCarouselInner>
//          <MDBCarouselItem itemId="1">
//            <MDBView>
//              <img
//                className="d-block w-100"
//                src="https://mdbootstrap.com/img/Photos/Slides/img%20(45).jpg"
//                alt="First slide"
//              />
//            </MDBView>
//          </MDBCarouselItem>
//          <MDBCarouselItem itemId="2">
//            <MDBView>
//              <img
//                className="d-block w-100"
//                src="https://mdbootstrap.com/img/Photos/Slides/img%20(46).jpg"
//                alt="Second slide"
//              />
//            </MDBView>
//          </MDBCarouselItem>
//          <MDBCarouselItem itemId="3">
//            <MDBView>
//              <img
//                className="d-block w-100"
//                src="https://mdbootstrap.com/img/Photos/Slides/img%20(47).jpg"
//                alt="Third slide"
//              />
//            </MDBView>
//          </MDBCarouselItem>
//        </MDBCarouselInner>
//      </MDBCarousel>
//    </MDBContainer>
//  );
// }

// export default CarouselPage;
// // With indicators
// // You can also add the indicators to the carousel, alongside the controls, too.

// // First slide
// // Previous
// // Next
// // JSX
// import React from "react";
// import { MDBCarousel, MDBCarouselInner, MDBCarouselItem, MDBView, MDBContainer } from
// "mdbreact";

// const CarouselPage = () => {
//  return (
//    <MDBContainer>
//      <MDBCarousel
//        activeItem={1}
//        length={3}
//        showControls={true}
//        showIndicators={true}
//        className="z-depth-1"
//      >
//        <MDBCarouselInner>
//          <MDBCarouselItem itemId="1">
//            <MDBView>
//              <img
//                className="d-block w-100"
//                src="https://mdbootstrap.com/img/Photos/Slides/img%20(130).jpg"
//                alt="First slide"
//              />
//            </MDBView>
//          </MDBCarouselItem>
//          <MDBCarouselItem itemId="2">
//            <MDBView>
//              <img
//                className="d-block w-100"
//                src="https://mdbootstrap.com/img/Photos/Slides/img%20(129).jpg"
//                alt="Second slide"
//              />
//            </MDBView>
//          </MDBCarouselItem>
//          <MDBCarouselItem itemId="3">
//            <MDBView>
//              <img
//                className="d-block w-100"
//                src="https://mdbootstrap.com/img/Photos/Slides/img%20(70).jpg"
//                alt="Third slide"
//              />
//            </MDBView>
//          </MDBCarouselItem>
//        </MDBCarouselInner>
//      </MDBCarousel>
//    </MDBContainer>
//  );
// }

// export default CarouselPage;
// // With captions
// // You can also add the captions to the carousel items.

// // If your content is not visible enough, you can cover the image with a darker mask.

// // You can easily change the intensity and color of the mask. To learn more read our MASKS documentation.

// // First slide
// // Light mask
// // First text

// // Previous
// // Next
// // JSX
// import React from "react";
// import { MDBCarousel, MDBCarouselCaption, MDBCarouselInner, MDBCarouselItem, MDBView, MDBMask, MDBContainer } from
// "mdbreact";

// const CarouselPage = () => {
//  return (
//    <MDBContainer>
//      <MDBCarousel
//      activeItem={1}
//      length={3}
//      showControls={true}
//      showIndicators={true}
//      className="z-depth-1"
//    >
//      <MDBCarouselInner>
//        <MDBCarouselItem itemId="1">
//          <MDBView>
//            <img
//              className="d-block w-100"
//              src="https://mdbootstrap.com/img/Photos/Slides/img%20(68).jpg"
//              alt="First slide"
//            />
//          <MDBMask overlay="black-light" />
//          </MDBView>
//          <MDBCarouselCaption>
//            <h3 className="h3-responsive">Light mask</h3>
//            <p>First text</p>
//          </MDBCarouselCaption>
//        </MDBCarouselItem>
//        <MDBCarouselItem itemId="2">
//          <MDBView>
//            <img
//              className="d-block w-100"
//              src="https://mdbootstrap.com/img/Photos/Slides/img%20(6).jpg"
//              alt="Second slide"
//            />
//          <MDBMask overlay="black-strong" />
//          </MDBView>
//          <MDBCarouselCaption>
//            <h3 className="h3-responsive">Strong mask</h3>
//            <p>Second text</p>
//          </MDBCarouselCaption>
//        </MDBCarouselItem>
//        <MDBCarouselItem itemId="3">
//          <MDBView>
//            <img
//              className="d-block w-100"
//              src="https://mdbootstrap.com/img/Photos/Slides/img%20(9).jpg"
//              alt="Third slide"
//            />
//          <MDBMask overlay="black-slight" />
//          </MDBView>
//          <MDBCarouselCaption>
//            <h3 className="h3-responsive">Slight Mast</h3>
//            <p>Third text</p>
//          </MDBCarouselCaption>
//        </MDBCarouselItem>
//      </MDBCarouselInner>
//    </MDBCarousel>
//    </MDBContainer>
//  );
// }

// export default CarouselPage;
// Multi-item carousel 

// Card image cap
// Card title
// Some quick example text to build on the card title and make up the bulk of the card's content.

// Card image cap
// Card title
// Some quick example text to build on the card title and make up the bulk of the card's content.

// Card image cap
// Card title
// Some quick example text to build on the card title and make up the bulk of the card's content.

// JSX
// import React from "react";
// import { MDBCarousel, MDBCarouselInner, MDBCarouselItem, MDBContainer, MDBRow, MDBCol, MDBCard, MDBCardImage,
// MDBCardBody, MDBCardTitle, MDBCardText, MDBBtn } from "mdbreact";

// const MultiCarouselPage = () => {
//  return (
//    <MDBContainer>
//      <MDBCarousel activeItem={1} length={3} slide={true} showControls={true} showIndicators={true} multiItem>
//        <MDBCarouselInner>
//          <MDBRow>
//            <MDBCarouselItem itemId="1">
//              <MDBCol md="4">
//                <MDBCard className="mb-2">
//                  <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(34).jpg" />
//                  <MDBCardBody>
//                    <MDBCardTitle>MDBCard title</MDBCardTitle>
//                    <MDBCardText>
//                      Some quick example text to build on the card title and
//                      make up the bulk of the card's content.
//                    </MDBCardText>
//                    <MDBBtn color="primary">MDBBtn</MDBBtn>
//                  </MDBCardBody>
//                </MDBCard>
//              </MDBCol>
//              <MDBCol md="4">
//                <MDBCard className="mb-2">
//                  <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(18).jpg" />
//                  <MDBCardBody>
//                    <MDBCardTitle>MDBCard title</MDBCardTitle>
//                    <MDBCardText>
//                      Some quick example text to build on the card title and
//                      make up the bulk of the card's content.
//                    </MDBCardText>
//                    <MDBBtn color="primary">MDBBtn</MDBBtn>
//                  </MDBCardBody>
//                </MDBCard>
//              </MDBCol>
//              <MDBCol md="4">
//                <MDBCard className="mb-2">
//                  <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(35).jpg" />
//                  <MDBCardBody>
//                    <MDBCardTitle>MDBCard title</MDBCardTitle>
//                    <MDBCardText>
//                      Some quick example text to build on the card title and
//                      make up the bulk of the card's content.
//                    </MDBCardText>
//                    <MDBBtn color="primary">MDBBtn</MDBBtn>
//                  </MDBCardBody>
//                </MDBCard>
//              </MDBCol>
//            </MDBCarouselItem>
//            <MDBCarouselItem itemId="2">
//              <MDBCol md="4">
//                <MDBCard className="mb-2">
//                  <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(60).jpg" />
//                  <MDBCardBody>
//                    <MDBCardTitle>MDBCard title</MDBCardTitle>
//                    <MDBCardText>
//                      Some quick example text to build on the card title and
//                      make up the bulk of the card's content.
//                    </MDBCardText>
//                    <MDBBtn color="primary">MDBBtn</MDBBtn>
//                  </MDBCardBody>
//                </MDBCard>
//              </MDBCol>
//              <MDBCol md="4">
//                <MDBCard className="mb-2">
//                  <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(47).jpg" />
//                  <MDBCardBody>
//                    <MDBCardTitle>MDBCard title</MDBCardTitle>
//                    <MDBCardText>
//                      Some quick example text to build on the card title and
//                      make up the bulk of the card's content.
//                    </MDBCardText>
//                    <MDBBtn color="primary">MDBBtn</MDBBtn>
//                  </MDBCardBody>
//                </MDBCard>
//              </MDBCol>
//              <MDBCol md="4">
//                <MDBCard className="mb-2">
//                  <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(48).jpg" />
//                  <MDBCardBody>
//                    <MDBCardTitle>MDBCard title</MDBCardTitle>
//                    <MDBCardText>
//                      Some quick example text to build on the card title and
//                      make up the bulk of the card's content.
//                    </MDBCardText>
//                    <MDBBtn color="primary">MDBBtn</MDBBtn>
//                  </MDBCardBody>
//                </MDBCard>
//              </MDBCol>
//            </MDBCarouselItem>
//            <MDBCarouselItem itemId="3">
//              <MDBCol md="4">
//                <MDBCard className="mb-2">
//                  <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(53).jpg" />
//                  <MDBCardBody>
//                    <MDBCardTitle>MDBCard title</MDBCardTitle>
//                    <MDBCardText>
//                      Some quick example text to build on the card title and
//                      make up the bulk of the card's content.
//                    </MDBCardText>
//                    <MDBBtn color="primary">MDBBtn</MDBBtn>
//                  </MDBCardBody>
//                </MDBCard>
//              </MDBCol>
//              <MDBCol md="4">
//                <MDBCard className="mb-2">
//                  <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(45).jpg" />
//                  <MDBCardBody>
//                    <MDBCardTitle>MDBCard title</MDBCardTitle>
//                    <MDBCardText>
//                      Some quick example text to build on the card title and
//                      make up the bulk of the card's content.
//                    </MDBCardText>
//                    <MDBBtn color="primary">MDBBtn</MDBBtn>
//                  </MDBCardBody>
//                </MDBCard>
//              </MDBCol>
//              <MDBCol md="4">
//                <MDBCard className="mb-2">
//                  <MDBCardImage className="img-fluid" src="https://mdbootstrap.com/img/Photos/Horizontal/Nature/4-col/img%20(41).jpg" />
//                  <MDBCardBody>
//                    <MDBCardTitle>MDBCard title</MDBCardTitle>
//                    <MDBCardText>
//                      Some quick example text to build on the card title and
//                      make up the bulk of the card's content.
//                    </MDBCardText>
//                    <MDBBtn color="primary">MDBBtn</MDBBtn>
//                  </MDBCardBody>
//                </MDBCard>
//              </MDBCol>
//            </MDBCarouselItem>
//          </MDBRow>
//        </MDBCarouselInner>
//      </MDBCarousel>
//    </MDBContainer>
//  );
// }

// export default MultiCarouselPage;



///////////////////////////

import React from "react";
import {  MDBRow, MDBCol, MDBCardBody, MDBIcon, MDBBtn, MDBView, MDBMask } from "mdbreact";

const ProjectsPage = () => {
  return (
    <section className="text-center my-5 pr-4 pl-4">
      <h2 className="h1-responsive font-weight-bold my-5">
        Our best projects
      </h2>
      <p className="grey-text w-responsive mx-auto mb-5">
        Duis aute irure dolor in reprehenderit in voluptate velit esse
        cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat
        cupidatat non proident, sunt in culpa qui officia deserunt mollit
        est laborum.
      </p>

      <MDBRow className="text-center">
        <MDBCol lg="4" md="12" className="mb-lg-0 mb-4">
          <MDBView className="overlay rounded z-depth-1" waves>
            <img
              src="https://mdbootstrap.com/img/Photos/Others/images/58.jpg"
              alt=""
              className="img-fluid"
            />
            <a href="#!">
              <MDBMask overlay="white-slight" />
            </a>
          </MDBView>
          <MDBCardBody className="pb-0">
            <h4 className="font-weight-bold my-3">Title of the news</h4>
            <p className="grey-text">
              Temporibus autem quibusdam et aut officiis debitis aut rerum
              necessitatibus saepe eveniet ut et voluptates repudiandae.
            </p>
            <MDBBtn color="indigo" size="sm">
              <MDBIcon far icon="clone" className="left" /> MDBView project
            </MDBBtn>
          </MDBCardBody>
        </MDBCol>
        <MDBCol lg="4" md="12" className="mb-lg-0 mb-4">
          <MDBView className="overlay rounded z-depth-1" waves>
            <img
              src="https://mdbootstrap.com/img/Photos/Others/project4.jpg"
              alt=""
              className="img-fluid"
            />
            <a href="#!">
              <MDBMask overlay="white-slight" />
            </a>
          </MDBView>
          <MDBCardBody className="pb-0">
            <h4 className="font-weight-bold my-3">Title of the news</h4>
            <p className="grey-text">
              Temporibus autem quibusdam et aut officiis debitis aut rerum
              necessitatibus saepe eveniet ut et voluptates repudiandae.
            </p>
            <MDBBtn color="indigo" size="sm">
              <MDBIcon far icon="clone" className="left" /> MDBView project
            </MDBBtn>
          </MDBCardBody>
        </MDBCol>
        <MDBCol lg="4" md="12" className="mb-lg-0 mb-4">
          <MDBView className="overlay rounded z-depth-1" waves>
            <img
              src="https://mdbootstrap.com/img/Photos/Others/images/88.jpg"
              alt=""
              className="img-fluid"
            />
            <a href="#!">
              <MDBMask overlay="white-slight" />
            </a>
          </MDBView>
          <MDBCardBody className="pb-0">
            <h4 className="font-weight-bold my-3">Title of the news</h4>
            <p className="grey-text">
              Temporibus autem quibusdam et aut officiis debitis aut rerum
              necessitatibus saepe eveniet ut et voluptates repudiandae.
            </p>
            <MDBBtn color="indigo" size="sm">
              <MDBIcon far icon="clone" className="left" /> MDBView project
            </MDBBtn>
          </MDBCardBody>
        </MDBCol>
      </MDBRow>
    </section>
  );
}

export default ProjectsPage;