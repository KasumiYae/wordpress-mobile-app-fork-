const express = require('express');

const rout = express.Router();

rout.use(express.json())


rout.get('/', (req, res) => {
  // res.send('Successfull response.');
  res.status(200).send([{
    id: "1",
    title: "cmt1",
    date:"123",
    content: "anbdiniolnwdioniwos",
    cate: "pending"
  },
  {
    id: "2",
    title: "cmt2",
    date:"1234",
    content: "2anbdiniolnwdioniwos",
    cate: "replied"
    }])
});

module.exports = rout