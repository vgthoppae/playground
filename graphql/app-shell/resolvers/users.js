const resolvers = {
    Query: {
      users: (parent, args, context, info) => context.model.User.findAll(),
      user: (parent, args, context, info) => {
        console.log(args.id);
        // let ret = context.model.users.filter(a => a.id == args.id);
        // return ret[0];
        return context.model.User.findByPk(args.id)
      },
      // me: (parent, args, context, info) => context.model.users[0]
    },
    Mutation: {
      createUser: (parent, { name }, context, info) => {
        return context.model.User.create({name:name})
      },
      removeUser: (parent, { id }, context, info) => {
        // let found = false;
        // context.model.users = context.model.users.filter(u => {
        //   if (u.id != id) {
        //     return u;
        //   } else {
        //     found = true;
        //   }
        // });
        // return found;
        return context.model.User.destroy({
          where: {
            id
          }
        })
      },
    },
    User: {
      cars: (parent, args, context, info) => {
        return context.model.Car.findAll({
          where: {
            userId: parent.id
          }
        })
      }
    }
  };

  module.exports = resolvers;