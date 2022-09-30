const bar = document.getElementById('bar-container')
const cate1 = document.querySelector('.cate1')
const cate2 = document.querySelector('.cate2')
const subcate1 = document.querySelector('.firstSubCategory')
const subcate2 = document.querySelector('.secondSubCategory')
const updown = document.querySelector('.up_down_icon')

// open the bar
const openBar = () => {
    bar.classList.toggle('active');
    if (bar.classList.contains('active'))
        updown.innerHTML = 'Find mentors &#9206;'
    else updown.innerHTML = 'Find mentors &#9207;';
}

// open subcategory1
const openCate1 = () => {
    subcate1.classList.add('active');
    subcate2.classList.remove('active');
    cate2.classList.remove('bg_active');
    cate1.classList.add('bg_active');
}

// open subcategory2
const openCate2 = () => {
    subcate2.classList.add('active');
    subcate1.classList.remove('active');
    cate2.classList.add('bg_active');
    cate1.classList.remove('bg_active');
}


