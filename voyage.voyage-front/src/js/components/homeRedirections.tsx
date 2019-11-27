import React from "react";
import {  MDBRow, MDBCol, MDBCard, MDBIcon, MDBBtn  } from "mdbreact";
import {  Link } from "react-router-dom";

const homeRedirections = () => {
  return (
    <section className='text-center my-5 mr-5 ml-5'>
      <h2 className='h2-responsive font-weight-bold my-5 deep-purple-text text-monospace text-uppercase z-depth-5'>Découvrez nos offres</h2>

      <MDBRow>
        <MDBCol md='12' className='mb-4'>
          <MDBCard
            className='card-image'
            style={{
              backgroundImage:
                'url(https://mdbootstrap.com/img/Photos/Others/img%20%2832%29.jpg)'
            }}
          >
            <div className='text-white text-center d-flex flex-column align-items-center rgba-black-strong py-5 px-4 rounded'>
              <h6 className='cyan-text text-uppercase font-weight-bold'>
                <MDBIcon icon='plane' />
                <strong> Voyageons</strong>
              </h6>
              <h3 className='py-3 font-weight-bold text-monospace text-uppercase'>
                <strong>Nos séjours</strong>
              </h3>
              <p className='pb-3 text-monospace lead'>
                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                Repellat fugiat, laboriosam, voluptatem, optio vero odio nam sit
                officia accusamus minus error nisi architecto nulla ipsum
                dignissimos. Odit sed qui, dolorum!
              </p>
              {/* color='default' */}
              <MDBBtn  gradient="blue" className="rounded-pill font-weight-bold">
              <Link to="/sejours" className="white-text z-depth-3">
                <MDBIcon far icon='clone' className='left' /> Voir les séjours
                </Link>
              </MDBBtn>
            </div>
          </MDBCard>
        </MDBCol>
        <MDBCol md='6' className='md-0 mb-4'>
          <MDBCard
            className='card-image'
            style={{
              backgroundImage:
                'url(https://mdbootstrap.com/img/Photos/Horizontal/Nature/6-col/img%20%2873%29.jpg)'
            }}
          >
            <div className='text-white text-center  d-flex align-items-center rgba-black-strong py-5 px-4 rounded'>
              <div>
                <h6 className='pink-text text-uppercase font-weight-bold'>
                  <MDBIcon icon='chart-pie' />
                  <strong> Amusons nous</strong>
                </h6>
                <h3 className='py-3 font-weight-bold text-monospace text-uppercase'>
                  <strong>Nos activités</strong>
                </h3>
                <p className='pb-3 text-monospace lead'>
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                  Repellat fugiat, laboriosam, voluptatem, dolorum!
                </p>
                {/* color='pink' */}
                <MDBBtn gradient="purple" className="rounded-pill font-weight-bold">
                <Link to="/services" className="white-text z-depth-3">
                  <MDBIcon far icon='clone' className='left' /> Voir les activités
                  </Link>
                </MDBBtn>
              </div>
            </div>
          </MDBCard>
        </MDBCol>
        <MDBCol md='6' className='md-0 mb-4'>
          <MDBCard
            className='card-image'
            style={{
              backgroundImage:
                'url(https://mdbootstrap.com/img/Photos/Horizontal/Nature/6-col/img%20%2873%29.jpg)'
            }}
          >
            <div className='text-white text-center d-flex align-items-center rgba-black-strong py-5 px-4 rounded'>
              <div>
                <h6 className='green-text text-uppercase font-weight-bold'>
                  <MDBIcon icon='eye' />
                  <strong> Des soins adaptés </strong>
                </h6>
                <h3 className='py-3 font-weight-bold text-monospace text-uppercase'>
                  <strong>Nos services</strong>
                </h3>
                <p className='pb-3 text-monospace lead'>
                  Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                  Repellat fugiat, laboriosam, voluptatem, dolorum!
                </p>
                {/* color='success' */}
                <MDBBtn gradient="aqua" className="rounded-pill font-weight-bold">
                <Link to="/activites" className="white-text z-depth-3">
                  <MDBIcon far icon='clone' className='left' /> Voir les services
                  </Link>
                </MDBBtn>
              </div>
            </div>
          </MDBCard>
        </MDBCol>
      </MDBRow>
    </section>
  );
}

export default homeRedirections;