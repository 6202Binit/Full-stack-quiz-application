import React, { useState } from "react";
import axios from "axios";
import "./Login.css"; // Import the CSS file

function Login() {
    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");

    const handleLogin = async () => {
        const response = await axios.post("http://localhost:8080/auth/login", { username, password });
        localStorage.setItem("token", response.data.token);
        window.location.href = "/dashboard";
    };

    return (
        <div className="login-container">
            <div className="login-form">
                <h2>Login</h2>
                <input
                    type="text"
                    placeholder="Username"
                    onChange={(e) => setUsername(e.target.value)}
                />
                <input
                    type="password"
                    placeholder="Password"
                    onChange={(e) => setPassword(e.target.value)}
                />
                <button onClick={handleLogin}>Login</button>
            </div>
        </div>
    );
}

export default Login;