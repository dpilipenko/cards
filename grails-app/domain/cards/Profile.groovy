package cards

class Profile {
  static hasMany = [decks: Deck]

  String name
  Date dateCreated
}
