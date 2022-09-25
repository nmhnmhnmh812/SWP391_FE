const scrollBtn = document.querySelector('#myBtn')


//handle scroll
window.onscroll = () => {
    scrollFunction()
}

// scroll
const scrollFunction = () => {
    if (document.documentElement.scrollTop > 20) {
        scrollBtn.classList.add('active')
    } else {
        scrollBtn.classList.remove('active')
    }
}

// scroll back to top
const topFunction = () => {
    document.body.scrollTop = 0;
    document.documentElement.scrollTop = 0;
}
