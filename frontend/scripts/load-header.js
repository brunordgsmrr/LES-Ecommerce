document.querySelector("header").innerHTML = `
    <img id="logo" src="../../img/logo.svg" alt="">
    <form>
        <input type="text" name="search-field" id="search-field" placeholder="Pesquisar item">
        <button type="submit"><img src="../img/search.svg" alt=""></button>
    </form>
    <div class="menu-header">
        <a href=""><img src="../img/shopping.svg" alt="" class="filter-white"></a>
        <a href="">
            <img src="../img/profile.svg" alt="" class="filter-white">
            <span>Admin</span>
        </a>
    </div>
`