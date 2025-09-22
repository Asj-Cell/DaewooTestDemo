import Moon from './moon[6.02KB].png';

function addImage() {
    const img = document.createElement('img');
    img.width = '200';
    img.src = Moon;
    img.alt = '이미지가 없는데요;;';

    const body = document.querySelector('body');
    body.appendChild(img);
}

export default addImage;