async function fetchProducts() {
    const productGrid = document.getElementById("product-grid");

    try {
        const response = await fetch("http://localhost:8080/api/v1/products");

        if (!response.ok) {
            if (response.status === 404) {
                throw new Error("Products not found (404)");
            }
            if (response.status === 500) {
                throw new Error("Server error (500)");
            }
            throw new Error("Failed to fetch products");
        }

        const products = await response.json();

        if (products.length === 0) {
            productGrid.innerHTML = "<p>No products available.</p>";
            return;
        }

        productGrid.innerHTML = products.map(product => `
            <article>
                <img src="${product.imageUrl}" alt="${product.name}" width="150">
                <h2>${product.name}</h2>
                <p>${product.description}</p>
                <p>Price: ₱${product.price}</p>
                <a href="#">View Details</a>
            </article>
            <br>
        `).join("");

    } catch (error) {
        console.error("Error loading products:", error);
        productGrid.innerHTML = "<p>Failed to load products.</p>";
    }
}

window.onload = fetchProducts;
