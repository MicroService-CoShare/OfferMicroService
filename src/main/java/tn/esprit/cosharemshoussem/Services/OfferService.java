package tn.esprit.cosharemshoussem.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.cosharemshoussem.Entities.Offer;
import tn.esprit.cosharemshoussem.Repositories.OfferRepository;

@Service
public class OfferService {
    @Autowired
    private OfferRepository offerRepository;
    public Offer addOffer(Offer offer) {
        return offerRepository.save(offer);
    }


}
