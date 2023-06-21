export class Rendez_vous{
    id?:number;
    daterdv?:string;
    heurerdv?:string;
    confirmed?:boolean;
    constructor(id?:number, daterdv?:string, heurerdv?:string, confirmed?:boolean){
        this.id=id;
        this.daterdv=daterdv;
        this.heurerdv=heurerdv;
        this.confirmed=confirmed;
    }
}