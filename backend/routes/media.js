//cai nay cua tao ke di
const express = require('express');

const rout = express.Router();

rout.use(express.static('../img'))


module.exports = rout