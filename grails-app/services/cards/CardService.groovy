package cards

import grails.transaction.Transactional

@Transactional
class CardService {
  
  def list() {
    return Person.where { isDeleted = false }
  }

  def create(Card card) {
    Card c = new Card()
    c.content = card.content
    c.save(flush:true)
    return c.id
  }

  def read(int cardID) {
    Card c = Card.findById(cardID)
    return c
  }

  def update(int cardID, Card card) {
    Card c = read(cardID)
    c.content = card.content
    c.save(flush:true)
    return read(c.id)
  }

  def delete(int cardID) {
    Card c = read(cardID)
    c.isDeleted = true
    c.save(flush:true)
    return read(c.id)
  }
}
