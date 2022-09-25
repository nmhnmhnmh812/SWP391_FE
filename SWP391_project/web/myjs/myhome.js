const imgForBanner = document.getElementById('imgForBanner')
const btn_seemore = document.getElementById('btn_seemore')
const scrollBtn = document.querySelector('#myBtn')
const navhome = document.querySelector('#nav_home')
const seemorepart = document.querySelector('.seemore')
const listItemTech = document.getElementsByClassName('item_contain')

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

// display list item of technologies as default
const defaultDisplayItemTech = () => {
    if (listItemTech.length > 4) {
        seemorepart.classList.remove('disable')
        for (let i = 4; i < listItemTech.length; i++) {
            listItemTech[i].classList.add('disable')
        }
    } else {
        seemorepart.classList.add('disable')
    }
}

defaultDisplayItemTech()

// handle load more items and see less items
const handleDisplayItemTech = () => {
    if (listItemTech.length > 4) {
        for (let i = 4; i < listItemTech.length; i++) {
            listItemTech[i].classList.toggle('disable')
        }
        if (listItemTech[listItemTech.length - 1].classList.contains('disable')) {
            btn_seemore.innerHTML = 'See All &#9207;'

        } else {
            btn_seemore.innerHTML = 'See Less &#9206;'
        }
    }
}
