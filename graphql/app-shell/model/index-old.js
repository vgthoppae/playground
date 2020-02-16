const users = [
    {
      id: 1,
      name: 'Tesfu',
      ownedCars: [2, 3]
    },
    {
      id: 2,
      name: 'Sam',
      ownedCars: [1]
    },
    {
      id: 3,
      name: 'Rodger'
    }
  ];
  
  const cars = [
    {
      id: 1,
      make: 'BMW',
      model: 'i5',
      color: 'Black',
      price: 80000,
      ownedby: 2
    },
    {
      id: 2,
      make: 'Infiniti',
      model: 'QX80',
      color: 'Green',
      price: 70000,
      ownedby: 1
    },
    {
      id: 3,
      make: 'Mercedes',
      model: 'ML350',
      color: 'Blue',
      price: 60000,
      ownedby: 1
    }
  ];
  
  module.exports = { users, cars };
  