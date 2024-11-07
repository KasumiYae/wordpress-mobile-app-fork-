const express = require('express');

const rout = express.Router();

rout.use(express.json())


rout.get('/', (req, res) => {
  // res.send('Successfull response.');
  res.status(200).send([{
    id: "1",
    title: "hello",
    date:"123",
    content: "anbdiniolnwdioniwos",
    cate: "posted"
  },
  {
    id: "2",
    title: "hello2",
    date:"1234",
    content: "2anbdiniolnwdioniwos",
    cate: "posted"
    }])
});

module.exports = rout