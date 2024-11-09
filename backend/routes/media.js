//cai nay cua tao ke di
const express = require('express');
const rout = express.Router();

// Serve static files from the "img" directory
rout.use(express.static('/img'));

// Route to generate a list of image URLs
rout.get('/images', (req, res) => {
    const baseUrl = `http://222.252.124.98:3000/media`; // Base URL for images
    const images = [];

    // Generate URLs for images from 12.png to 21.png
    for (let i = 0; i <= 36; i++) {
        images.push(`${baseUrl}/cat_${i}.png`);
    }

    // Return the array of image URLs as JSON
    res.json(images);
});

module.exports = rout;
