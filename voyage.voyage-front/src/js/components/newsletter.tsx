import React from "react";
import { MDBContainer, MDBRow, MDBCol, MDBBtn, MDBIcon,  } from 'mdbreact';

const subscribeNews = () => {
  return (
    
    // <div class="card card-image" style="background-image: url(https://mdbootstrap.com/img/Photos/Others/forest2.jpg);">
    //   <div class="text-white text-center rgba-stylish-strong py-5 px-4">
    //     <div class="py-5">
    
         
    //       <h5 class="h5 orange-text"><i class="fas fa-camera-retro"></i> Photography</h5>
    //       <h2 class="card-title h2 my-4 py-2">Jumbotron with image overlay</h2>
    //       <p class="mb-4 pb-2 px-md-5 mx-md-5">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Pariatur obcaecati vero aliquid libero doloribus ad, unde tempora maiores, ullam, modi qui quidem minima debitis perferendis vitae cumque et quo impedit.</p>
    //       <a class="btn peach-gradient"><i class="fas fa-clone left"></i> View project</a>
    
    //     </div>
    //   </div>
    // </div>

    
    <MDBContainer>
      <MDBRow>
        <MDBCol md="6">
          <form>
            <p className="h4 text-center py-4">Recevez les dernières offres de séjours</p>
            <label
              htmlFor="defaultFormCardNameEx"
              className="grey-text font-weight-light"
            >
              Votre prénom
            </label>
            <input
              type="text"
              id="defaultFormCardNameEx"
              className="form-control"
            />
            <br />
            <label
              htmlFor="defaultFormCardEmailEx"
              className="grey-text font-weight-light"
            >
              Votre email
            </label>
            <input
              type="email"
              id="defaultFormCardEmailEx"
              className="form-control"
            />
            <div className="text-center py-4 mt-3">
              <MDBBtn className="btn btn-outline-purple" type="submit">
                Envoyer
                <MDBIcon far icon="paper-plane" className="ml-2" />
              </MDBBtn>
            </div>
          </form>
        </MDBCol>
      </MDBRow>
    </MDBContainer>
  );
};

export default subscribeNews;