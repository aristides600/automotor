document.addEventListener("DOMContentLoaded", function () {
    const provinciaSelect = document.getElementById("provincia");

    // Cargar provincias desde /api/provincia al cargar la página
    fetch("/api/provincias")
        .then(response => response.json())
        .then(provincias => {
            provincias.forEach(provincia => {
                const option = document.createElement("option");
                option.value = provincia.pro_id;
                option.textContent = provincia.pro_nombre;
                provinciaSelect.appendChild(option);
            });
        });

    const form = document.getElementById("localidad-form");
    form.addEventListener("submit", function (event) {
        event.preventDefault();

        const nombre = document.getElementById("nombre").value;
        const provinciaId = provinciaSelect.value;

        const localidad = {
            loc_nombre: nombre
        };

        fetch(`/api/localidad/${provinciaId}`, {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(localidad)
        })
        .then(response => {
            if (response.ok) {
                alert("Localidad creada exitosamente.");
                form.reset();
            } else {
                alert("Error al crear la localidad.");
            }
        })
        .catch(error => {
            console.error("Error:", error);
            alert("Error al crear la localidad.");
        });
    });
});
