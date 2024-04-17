<html lang="en" data-bs-theme="light">
<head><script src="/docs/5.3/assets/js/color-modes.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/static/css/about.css">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.122.0">
    <title>Pricing example · Bootstrap v5.3</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.3/examples/pricing/">



    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@docsearch/css@3">

    <link href="/docs/5.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

    <!-- Favicons -->
    <link rel="apple-touch-icon" href="/docs/5.3/assets/img/favicons/apple-touch-icon.png" sizes="180x180">
    <link rel="icon" href="/docs/5.3/assets/img/favicons/favicon-32x32.png" sizes="32x32" type="image/png">
    <link rel="icon" href="/docs/5.3/assets/img/favicons/favicon-16x16.png" sizes="16x16" type="image/png">
    <link rel="manifest" href="/docs/5.3/assets/img/favicons/manifest.json">
    <link rel="mask-icon" href="/docs/5.3/assets/img/favicons/safari-pinned-tab.svg" color="#712cf9">
    <link rel="icon" href="/docs/5.3/assets/img/favicons/favicon.ico">
    <meta name="theme-color" content="#712cf9">

    <!-- Custom styles for this template -->

</head>
<body>
<svg xmlns="http://www.w3.org/2000/svg" class="d-none">
    <symbol id="check2" viewBox="0 0 16 16">
        <path d="M13.854 3.646a.5.5 0 0 1 0 .708l-7 7a.5.5 0 0 1-.708 0l-3.5-3.5a.5.5 0 1 1 .708-.708L6.5 10.293l6.646-6.647a.5.5 0 0 1 .708 0z"></path>
    </symbol>
    <symbol id="circle-half" viewBox="0 0 16 16">
        <path d="M8 15A7 7 0 1 0 8 1v14zm0 1A8 8 0 1 1 8 0a8 8 0 0 1 0 16z"></path>
    </symbol>
    <symbol id="moon-stars-fill" viewBox="0 0 16 16">
        <path d="M6 .278a.768.768 0 0 1 .08.858 7.208 7.208 0 0 0-.878 3.46c0 4.021 3.278 7.277 7.318 7.277.527 0 1.04-.055 1.533-.16a.787.787 0 0 1 .81.316.733.733 0 0 1-.031.893A8.349 8.349 0 0 1 8.344 16C3.734 16 0 12.286 0 7.71 0 4.266 2.114 1.312 5.124.06A.752.752 0 0 1 6 .278z"></path>
        <path d="M10.794 3.148a.217.217 0 0 1 .412 0l.387 1.162c.173.518.579.924 1.097 1.097l1.162.387a.217.217 0 0 1 0 .412l-1.162.387a1.734 1.734 0 0 0-1.097 1.097l-.387 1.162a.217.217 0 0 1-.412 0l-.387-1.162A1.734 1.734 0 0 0 9.31 6.593l-1.162-.387a.217.217 0 0 1 0-.412l1.162-.387a1.734 1.734 0 0 0 1.097-1.097l.387-1.162zM13.863.099a.145.145 0 0 1 .274 0l.258.774c.115.346.386.617.732.732l.774.258a.145.145 0 0 1 0 .274l-.774.258a1.156 1.156 0 0 0-.732.732l-.258.774a.145.145 0 0 1-.274 0l-.258-.774a1.156 1.156 0 0 0-.732-.732l-.774-.258a.145.145 0 0 1 0-.274l.774-.258c.346-.115.617-.386.732-.732L13.863.1z"></path>
    </symbol>
    <symbol id="sun-fill" viewBox="0 0 16 16">
        <path d="M8 12a4 4 0 1 0 0-8 4 4 0 0 0 0 8zM8 0a.5.5 0 0 1 .5.5v2a.5.5 0 0 1-1 0v-2A.5.5 0 0 1 8 0zm0 13a.5.5 0 0 1 .5.5v2a.5.5 0 0 1-1 0v-2A.5.5 0 0 1 8 13zm8-5a.5.5 0 0 1-.5.5h-2a.5.5 0 0 1 0-1h2a.5.5 0 0 1 .5.5zM3 8a.5.5 0 0 1-.5.5h-2a.5.5 0 0 1 0-1h2A.5.5 0 0 1 3 8zm10.657-5.657a.5.5 0 0 1 0 .707l-1.414 1.415a.5.5 0 1 1-.707-.708l1.414-1.414a.5.5 0 0 1 .707 0zm-9.193 9.193a.5.5 0 0 1 0 .707L3.05 13.657a.5.5 0 0 1-.707-.707l1.414-1.414a.5.5 0 0 1 .707 0zm9.193 2.121a.5.5 0 0 1-.707 0l-1.414-1.414a.5.5 0 0 1 .707-.707l1.414 1.414a.5.5 0 0 1 0 .707zM4.464 4.465a.5.5 0 0 1-.707 0L2.343 3.05a.5.5 0 1 1 .707-.707l1.414 1.414a.5.5 0 0 1 0 .708z"></path>
    </symbol>
</svg>

<div class="container py-3">
    <header>
        <div class="d-flex flex-column flex-md-row align-items-center pb-3 mb-4 border-bottom">
            <nav class="d-inline-flex mt-2 mt-md-0 me-auto">
                <a class="me-3 ms-4 py-2 link-body-emphasis text-decoration-none" href="#" style="font-family: Kumbh Sans; color: black;">О НАС</a>
                <a class="me-3 ms-4 py-2 link-body-emphasis text-decoration-none" href="#" style="font-family: Kumbh Sans; color: black;">АВТОРЫ</a>
                <a class="me-3 ms-4 py-2 link-body-emphasis text-decoration-none" href="#" style="font-family: Kumbh Sans; color: black;">КАТАЛОГ</a>
                <a class="me-3 ms-4 py-2 link-body-emphasis text-decoration-none" href="#" style="font-family: Kumbh Sans; color: black;">ОТКРЫТИЯ</a>
            </nav>
            <div class="ms-auto" style="display: flex; align-items: center;">
                <div style="width: 225px; height: 38px; flex-direction: column; justify-content: flex-start; align-items: flex-start; gap: 10px; display: inline-flex;">
                    <div style="width: 225px; height: 38px; background: rgba(238, 235, 235, 0); border-radius: 18px; border: 1px solid grey; display: flex; align-items: center; padding-left: 10px;">
                        <input type="text" style="flex-grow: 1; border: none; background: transparent; padding: 5px; color: black; font-size: 14px; font-family: Kumbh Sans; font-weight: 400;" placeholder="Поиск...">
                    </div>
                </div>
                <a href="#" style="text-decoration: none; margin-left: 20px;">
                    <div style="width: 76px; height: 38px; position: relative; display: inline-flex;">
                        <div style="width: 76px; height: 38px; background: rgba(238, 235, 235, 0); border-radius: 18px; border: 0.30px black solid;"></div>
                        <div style="position: absolute; left: 16px; top: 12px; color: black; font-size: 12px; font-family: Kumbh Sans; font-weight: 400; text-transform: uppercase;">войти</div>
                    </div>
                </a>
                <a href="#" style="text-decoration: none; margin-left: 5px">
                    <div style="width: 155px; height: 38px; position: relative; display: inline-flex;">
                        <div style="width: 155px; height: 38px; background: #907486; box-shadow: 0px 5px 4px rgba(0, 0, 0, 0.25); border-radius: 18px; border: 0.30px #907486 solid;"></div>
                        <div style="position: absolute; left: 6px; top: 11px; width: 144px; height: 14px; text-align: center; color: white; font-size: 11px; font-family: Kumbh Sans; font-weight: 400; text-transform: uppercase;">зарегистрироваться</div>
                    </div>
                </a>
            </div>
        </div>
    </header>
    <br><br>

    <section class="py-5 text-center container">
    <div class="row py-lg-5">
        <div class="col-lg-6 col-md-8 mx-auto">
            <h1 class="fw-light">ART GALLERY</h1>
            <p class="lead text-body-secondary">Расскажи о себе создав портфолио </p>
        </div>
    </div>
    <#list authors  as author>
        <form action="/GetPortfolio" method="post">
            <tr>
                <div class="col">
                    <div class="card shadow-sm">
                        <img src="/images/${author.previewImageID}">
                        <div class="card-body">
                            <p class="card-text">${author.title}</p>
                            <input type="hidden" name="name" value="${author.name}" readonly>
                            <div class="d-flex justify-content-between align-items-center">
                                <div class="btn-group">
                                    <input type="hidden" name="_csrf" value="${_csrf.token}">
                                    <input type="submit" class="btn btn-sm btn-outline-secondary" value="Дополнить портфолио">
                                </div>
                                <small class="text-body-secondary"> ${author.name} </small>
                                <input type="hidden" name="cost" value="${author.place}" readonly>
                                <input type="hidden" name="cost" value="${author.education}" readonly>
                                <input type="hidden" name="cost" value="${author.place_of_work}" readonly>
                                <input type="hidden" name="cost" value="${author.quentuty}" readonly>
                                <input type="hidden" name="image" value="/images/${author.previewImageID}" />
                            </div>
                        </div>
                    </div>
                </div>
            </tr>
        </form>
    </#list>
</section>
    <br><br>
    <footer class="pt-4 my-md-5 pt-md-5 border-top">
        <div class="container">
            <div class="row justify-content-center">
                <div class="col-md-auto">
                    <div class="d-flex flex-column flex-md-row align-items-center pb-3 mb-4 border-bottom">
                        <nav class="d-inline-flex mt-2 mt-md-0 me-auto">
                            <a class="me-3 ms-4 py-2 link-body-emphasis text-decoration-none" href="#" style="font-family: Kumbh Sans; color: grey;">О НАС</a>
                            <a class="me-3 ms-4 py-2 link-body-emphasis text-decoration-none" href="#" style="font-family: Kumbh Sans; color: grey;">АВТОРЫ</a>
                            <a class="me-3 ms-4 py-2 link-body-emphasis text-decoration-none" href="#" style="font-family: Kumbh Sans; color: grey;">КАТАЛОГ</a>
                            <a class="me-3 ms-4 py-2 link-body-emphasis text-decoration-none" href="#" style="font-family: Kumbh Sans; color: grey;">ОТКРЫТИЯ</a>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <script src="/docs/5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</div>
<script src="/docs/5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>



</body></html>