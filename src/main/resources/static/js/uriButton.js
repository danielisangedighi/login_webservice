// uri-script.js

document.addEventListener("DOMContentLoaded", function () {
    const button = document.getElementById("myButton");

    button.addEventListener("click", function () {
        // Replace this with your dynamic ID (e.g., from user input or other sources)
        const userId = 2; // Example ID

        // Construct the URI
        const baseUri = window.location.origin; // Get the base URL
        const uri = `${baseUri}/profile/${userId}`;

        // Update the browser address bar without reloading the page
        window.history.pushState({}, "", uri);

        // Reload the page
        window.location.reload();
    });
});
